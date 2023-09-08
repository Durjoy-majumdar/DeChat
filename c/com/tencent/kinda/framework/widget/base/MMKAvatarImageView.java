package com.tencent.kinda.framework.widget.base;

import android.widget.ImageView;
import com.tencent.kinda.gen.KAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p196ln.C76705f;

public class MMKAvatarImageView extends MMKImageView implements KAvatarImageView {
    private String username;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        Class cls = C76705f.class;
        this.username = str;
        if (!Util.isNullOrNil(str)) {
            if (getCornerRadius() != 0.0f) {
                ((C76705f) C86312j.m106911c(cls)).D20((ImageView) getView(), this.username, getCornerRadius());
            } else {
                ((C76705f) C86312j.m106911c(cls)).mo106849z((ImageView) getView(), this.username);
            }
            notifyChanged();
        }
    }
}
