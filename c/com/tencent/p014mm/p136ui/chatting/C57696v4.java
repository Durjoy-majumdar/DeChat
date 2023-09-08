package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40358f0;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C97625j3;
import java.io.IOException;
import nj3.C76879j;
import pe3.C89349b;
import te3.C52007xq3;
import te3.C64763v03;

/* renamed from: com.tencent.mm.ui.chatting.v4 */
public class C57696v4 implements C57702l.C57703a {

    /* renamed from: a */
    public final /* synthetic */ C57702l f165135a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f165136b;

    /* renamed from: c */
    public final /* synthetic */ TextPreviewUI f165137c;

    public C57696v4(TextPreviewUI textPreviewUI, C57702l lVar, C72963f4 f4Var) {
        this.f165137c = textPreviewUI;
        this.f165135a = lVar;
        this.f165136b = f4Var;
    }

    /* renamed from: a */
    public void mo82035a(long j) {
        C104428a aVar = this.f165135a.f165144c;
        if (aVar != null) {
            aVar.dismiss();
        }
        C115669n.INSTANCE.idkeyStat(795, 1, 1, false);
        if (!NetStatusUtil.isConnected((Context) this.f165137c.getContext())) {
            C76879j.m92748s(this.f165137c.getContext(), this.f165137c.getString(C0966R.string.f360087a11), this.f165137c.getString(C0966R.string.hzd));
            return;
        }
        C52007xq3 xq32 = new C52007xq3();
        xq32.f144879f = (int) (j / 1000);
        xq32.f144878e = 1;
        xq32.f144880g = 1;
        try {
            C64763v03 v032 = new C64763v03();
            v032.f185817f = this.f165136b.mo108768t();
            v032.f185818g = this.f165136b.mo108774y2();
            v032.f185815d = this.f165137c.mo102118K7(this.f165136b);
            xq32.f144881h = new C89349b(v032.toByteArray());
        } catch (IOException e) {
            Log.m105921e("MicroMsg.TextPreviewUI", "[onOk] %s", e.toString());
        }
        C97625j3.m125815e().mo123460f(new C40358f0(1, xq32));
    }

    public void onCancel() {
        C104428a aVar = this.f165135a.f165144c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }
}
