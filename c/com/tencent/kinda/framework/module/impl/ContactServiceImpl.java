package com.tencent.kinda.framework.module.impl;

import android.widget.ImageView;
import com.tencent.kinda.framework.widget.base.MMKImageView;
import com.tencent.kinda.gen.KContact;
import com.tencent.kinda.gen.KContactService;
import com.tencent.kinda.gen.KImageView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import p196ln.C76705f;

public class ContactServiceImpl implements KContactService {
    public void attachAvatar(String str, KImageView kImageView) {
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) ((MMKImageView) kImageView).getView(), str);
    }

    public KContact get(String str) {
        return new ContactImpl(str);
    }

    public long getCryptUin() {
        return 0;
    }

    public String getUserName() {
        return C75228t.m90272u();
    }

    public boolean isEuropeRegUser() {
        return false;
    }
}
