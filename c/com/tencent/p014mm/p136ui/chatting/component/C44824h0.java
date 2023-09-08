package com.tencent.p014mm.p136ui.chatting.component;

import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;
import xy1.C15912f;

/* renamed from: com.tencent.mm.ui.chatting.component.h0 */
public class C44824h0 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C74974a f121645d;

    /* renamed from: e */
    public final /* synthetic */ C15912f f121646e;

    /* renamed from: f */
    public final /* synthetic */ ChatFooter f121647f;

    /* renamed from: g */
    public final /* synthetic */ C44830j0 f121648g;

    public C44824h0(C44830j0 j0Var, C74974a aVar, C15912f fVar, ChatFooter chatFooter) {
        this.f121648g = j0Var;
        this.f121645d = aVar;
        this.f121646e = fVar;
        this.f121647f = chatFooter;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int l = this.f121645d.mo104255l();
        if (l >= 0) {
            int b = l - C76577a.m92151b(this.f121648g.f215752d.mo91565f(), 52);
            String str = null;
            if (!TextUtils.isEmpty(this.f121646e.getTag()) && this.f121646e.mo422D0() == 1) {
                str = String.format(" (%s)", new Object[]{this.f121646e.getTag()});
            }
            String nullAsNil = Util.nullAsNil(this.f121646e.mo423V().getNickname());
            if (str != null) {
                nullAsNil = nullAsNil + str;
            }
            float desiredWidth = Layout.getDesiredWidth(nullAsNil + " : ", this.f121645d.getPaint());
            StringBuilder sb = new StringBuilder();
            String nickname = this.f121646e.mo423V().getNickname();
            if (nickname == null || desiredWidth <= ((float) b)) {
                sb.append(nickname);
            } else {
                String h = C45078p0.m49929h(nickname, str == null ? 20 : 12);
                if (Character.isHighSurrogate(h.charAt(h.length() - 1))) {
                    h = h.substring(0, h.length() - 1);
                }
                sb.append(h);
                sb.append("...");
            }
            if (str != null) {
                sb.append(str);
            }
            if (sb.length() != 0) {
                sb.append(" : ");
            }
            this.f121647f.mo100358J0(this.f121648g.f215752d.mo91573n(), Boolean.FALSE, ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f121648g.f215752d.mo91565f(), sb));
            this.f121645d.removeOnLayoutChangeListener(this);
        }
    }
}
