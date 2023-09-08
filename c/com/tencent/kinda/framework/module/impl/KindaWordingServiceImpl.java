package com.tencent.kinda.framework.module.impl;

import android.content.Context;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KWordingService;
import com.tencent.kinda.gen.Wording;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;

public class KindaWordingServiceImpl implements KWordingService {
    public Wording getWording(String str, String str2) {
        String str3 = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        String str4 = "desc";
        Wording wording = new Wording(true, "entryTip", str3, "subTitle", str4, "subDesc");
        Context context = KindaContext.get();
        if (str.equals("valid_date")) {
            if (context != null) {
                str3 = context.getString(C0966R.string.koo);
                str4 = context.getString(C0966R.string.kop);
            }
            return new Wording(true, "entryTip", str3, "subTitle", str4, "subDesc");
        } else if (str.equals("cvv")) {
            if (context != null) {
                str3 = context.getString(C0966R.string.bwr);
                str4 = context.getString(C0966R.string.bwp);
            }
            return new Wording(true, "entryTip", str3, "subTitle", str4, "subDesc");
        } else if (str.equals("phone_number") || str.equals("sms")) {
            return wording;
        } else {
            str.equals("person");
            return wording;
        }
    }
}
