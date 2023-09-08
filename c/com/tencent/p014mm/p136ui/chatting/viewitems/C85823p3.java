package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.chatting.viewitems.C85824q3;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import di3.C86312j;
import kb0.C33865k;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p3 */
public class C85823p3 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ C68070l.C68072b f249951e;

    /* renamed from: f */
    public final /* synthetic */ C85824q3.C85833e f249952f;

    /* renamed from: g */
    public final /* synthetic */ String f249953g;

    /* renamed from: h */
    public final /* synthetic */ C67391b f249954h;

    /* renamed from: i */
    public final /* synthetic */ C80995a f249955i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85823p3(int i, C53155r0 r0Var, C68070l.C68072b bVar, C85824q3.C85833e eVar, String str, C67391b bVar2, C80995a aVar) {
        super(i, r0Var);
        this.f249951e = bVar;
        this.f249952f = eVar;
        this.f249953g = str;
        this.f249954h = bVar2;
        this.f249955i = aVar;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        Class cls = C33865k.class;
        ((C33865k) C86312j.m106911c(cls)).mo59340sd(view.getContext());
        ((C33865k) C86312j.m106911c(cls)).mo59341tE(this.f249951e.f195593k2, 2);
        this.f249952f.f249984t.setText(this.f249953g);
        WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new WxaUpdatableMsgReportStruct();
        wxaUpdatableMsgReportStruct.f237460d = wxaUpdatableMsgReportStruct.mo86045b("AppId", this.f249951e.f195577g2, true);
        wxaUpdatableMsgReportStruct.f237461e = wxaUpdatableMsgReportStruct.mo86045b("PageId", this.f249951e.f195569e2, true);
        wxaUpdatableMsgReportStruct.f237463g = wxaUpdatableMsgReportStruct.mo86045b("ShareTicket", this.f249951e.f195593k2, true);
        wxaUpdatableMsgReportStruct.f237464h = wxaUpdatableMsgReportStruct.mo86045b("ChattingId", this.f249954h.mo91577r(), true);
        wxaUpdatableMsgReportStruct.f237465i = this.f249954h.mo91583x() ? WxaUpdatableMsgReportStruct.C80797c.YES : WxaUpdatableMsgReportStruct.C80797c.NO;
        wxaUpdatableMsgReportStruct.f237466j = WxaUpdatableMsgReportStruct.C80796b.CLICKSUBSCRIBETV;
        wxaUpdatableMsgReportStruct.f237467k = 0;
        wxaUpdatableMsgReportStruct.f237468l = wxaUpdatableMsgReportStruct.mo86045b("SceneNote", "", true);
        long nowMilliSecond = Util.nowMilliSecond();
        wxaUpdatableMsgReportStruct.f237462f = nowMilliSecond;
        wxaUpdatableMsgReportStruct.mo86048e("ActionTimeStampMs", nowMilliSecond);
        wxaUpdatableMsgReportStruct.f237469m = WxaUpdatableMsgReportStruct.C80798d.DEFAULT;
        wxaUpdatableMsgReportStruct.f237471o = WxaUpdatableMsgReportStruct.C80795a.m98639a(this.f249955i.f237895d + 1000);
        wxaUpdatableMsgReportStruct.f237470n = WxaUpdatableMsgReportStruct.C80799e.DEFAULT;
        wxaUpdatableMsgReportStruct.mo86054n();
    }
}
