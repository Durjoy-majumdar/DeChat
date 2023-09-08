package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.chatting.C73681e3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import i61.C98602h;
import p645pj.C77092c;
import p910lj.C76701a;
import pc0.C100760a0;
import z51.C39315g;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.t4$$c */
public class t4$$c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f216127d;

    /* renamed from: e */
    public final /* synthetic */ C79387w f216128e;

    /* renamed from: f */
    public final /* synthetic */ String f216129f;

    /* renamed from: g */
    public final /* synthetic */ String f216130g;

    /* renamed from: h */
    public final /* synthetic */ C73601t4 f216131h;

    public t4$$c(C73601t4 t4Var, boolean z, C79387w wVar, String str, String str2) {
        this.f216131h = t4Var;
        this.f216127d = z;
        this.f216128e = wVar;
        this.f216129f = str;
        this.f216130g = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Class cls = C39315g.class;
        if (!this.f216127d || this.f216128e.mo102193k1() == null || this.f216128e.mo102193k1().getCallback() == null || !(this.f216128e.mo102193k1().getCallback() instanceof C73681e3)) {
            C115669n.INSTANCE.mo175911u(1062, 21);
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = 5;
            b.f295188b = this.f216131h.f215752d.mo91573n();
            b.f295187a = this.f216131h.f215752d.mo91577r();
            b.f295196j = this.f216130g;
            b.f295197k = 0;
            b.f295198l = null;
            b.f295200n = 0;
            b.f295204r = "";
            b.f295205s = "";
            b.f295202p = true;
            b.f295201o = C0966R.C0969drawable.by8;
            b.f295194h = 11;
            b.mo140195a().mo123694a();
            return;
        }
        if (this.f216129f.contains("com.sohu.inputmethod.sogou")) {
            C115669n.INSTANCE.mo175911u(1062, 3);
        } else if (this.f216129f.contains("com.tencent.qqpinyin")) {
            C115669n.INSTANCE.mo175911u(1062, 4);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if ((BitmapUtil.decodeFile(this.f216130g, options) == null || options.outHeight <= C77092c.m93041c()) && options.outWidth <= C77092c.m93041c()) {
            WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXEmojiObject(this.f216130g));
            String D = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137996D(this.f216131h.f215752d.mo91565f(), wXMediaMessage, (String) null);
            if (D != null) {
                ((C73681e3) this.f216128e.mo102193k1().getCallback()).mo102724c(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(D));
                return;
            }
            return;
        }
        C76701a.makeText((Context) this.f216131h.f215752d.mo91565f(), (int) C0966R.string.c5n, 0).show();
    }
}
