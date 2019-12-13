package com.beyene.manifestmaker;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class TwilioAlert
{

    public static final String ACCOUNT_SID = "accountOmitted";
    public static final String AUTH_TOKEN = "tokenOmitted";

    public static String from = "+1phoneNumberOmited";

    public void sms(ArrayList<String> selectedContacts, String textMessage)
    {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message;
        for (String s : selectedContacts)
        {
            s.strip().replace("-", "");
            message = Message.creator(new PhoneNumber("+1" + s),
                    new PhoneNumber(from),
                    textMessage).create();

            System.out.println(message.getSid());
        }

    }
    public void call(ArrayList<String> selectedContacts, String URIString)
    {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Call call = null;
        try
        {
            for (String s : selectedContacts)
            {
                s.strip().replace("-", "");
                call = Call.creator(new PhoneNumber("+1" + s), new PhoneNumber(from),
                        new URI(URIString)).create();

                System.out.println(call.getSid());
            }
        } catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
    }
}
