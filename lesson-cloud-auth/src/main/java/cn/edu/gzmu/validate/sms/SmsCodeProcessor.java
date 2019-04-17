package cn.edu.gzmu.validate.sms;

import cn.edu.gzmu.validate.ValidateCodeSender;
import cn.edu.gzmu.validate.impl.AbstractValidateCodeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author echo
 * @version 1.0
 * @date 19-4-14 14:08
 */
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor extends AbstractValidateCodeProcessor<SmsCode> {

    @Autowired
    private ValidateCodeSender smsCodeSender;

    @Override
    protected void send(ServletWebRequest request, SmsCode validateCode) throws ServletRequestBindingException {
        smsCodeSender.send(request.getHeader("sms"), validateCode.getCode());
    }

}