package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46547x1;
import je1.C60798d2;
import jq3.C60898l;
import jq3.C60905o;
import ke3.C88144b;
import kotlin.Metadata;
import kr0.C76630x0;
import nr3.C89059e;
import o40.C61926c;
import p749xh.C66276va;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64580ne1;
import te3.C64586nn1;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$5", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$5 */
public final class FinderMsgContract$MsgViewCallback$initView$5 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160420d;

    public FinderMsgContract$MsgViewCallback$initView$5(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160420d = msgViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        FinderJumpInfo finderJumpInfo;
        RecyclerView.C16613e eVar2 = eVar;
        C60905o oVar = (C60905o) zVar;
        Class cls = C58684b.class;
        Class cls2 = FinderCommonFeatureService.class;
        Class cls3 = C58417y0.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < this.f160420d.f160389f.f160381i.size()) {
            C55011a aVar = this.f160420d.f160389f.f160381i.get(c6);
            C87412m.m108593f(aVar, "presenter.getData()[fixPos]");
            C55011a aVar2 = aVar;
            if (!(aVar2 instanceof C39993q1)) {
                C66276va vaVar = aVar2.f154465d;
                String str = this.f160420d.f160387d;
                Log.m105924i(str, "onClick " + c6 + " id:" + vaVar.field_id + " commentId:" + vaVar.field_commentId);
                FinderMsgContract.MsgViewCallback.UICallbackListener uICallbackListener = this.f160420d.f160399s;
                if (uICallbackListener != null) {
                    uICallbackListener.mo78477J(vaVar);
                }
                FinderMsgContract.MsgPresenter msgPresenter = this.f160420d.f160389f;
                int i2 = 0;
                C49712hj1 hj12 = null;
                if (msgPresenter.f160376d == 1 && msgPresenter.f160377e == 1 && c6 == 0) {
                    C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                    if (c != null) {
                        i2 = c.field_systemMsgCount;
                    }
                    ((C58417y0) C86312j.m106911c(cls3)).Yx0(i2, 2);
                    ((C58684b) C86312j.m106911c(cls)).Ix0(this.f160420d.f160390g, (Intent) null);
                    if (i2 > 0) {
                        C7335d c2 = C86312j.m106911c(cls3);
                        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                        C58417y0 y0Var = (C58417y0) c2;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160420d.f160390g);
                        C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, 4, 2, 5, 0, i2, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
                    }
                    C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("NotificitionCenterNotify");
                    C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("NotificitionCenterNotify");
                    FinderMsgContract.MsgViewCallback msgViewCallback = this.f160420d;
                    if (G5 != null && R5 != null) {
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f2 = C13442s8.f38060Q0.mo12873f(msgViewCallback.f160390g);
                        if (f2 != null) {
                            hj12 = f2.mo12861q3();
                        }
                        C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, G5, R5, 2, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77239M5("NotificitionCenterNotify");
                        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77239M5("AuthorProfileNotify");
                        return;
                    }
                    return;
                }
                int i3 = vaVar.field_type;
                if (i3 == 1) {
                    ((C58417y0) C86312j.m106911c(cls3)).Wx0(vaVar.field_type, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                    ((C58684b) C86312j.m106911c(cls)).Gx0(this.f160420d.f160390g, (Intent) null);
                } else if (i3 == 10 || i3 == 11) {
                    if (i3 == 11 && !Util.isNullOrNil(vaVar.field_username)) {
                        Intent intent = new Intent();
                        intent.putExtra("finder_username", vaVar.field_username);
                        C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                        Context context = oVar.f173499A;
                        C87412m.m108593f(context, "holder.context");
                        C13442s8.C13443a.m12791e(aVar3, context, intent, 0, (String) null, 0, 9, false, 0, 192, (Object) null);
                        Context context2 = oVar.f173499A;
                        C87412m.m108593f(context2, "holder.context");
                        ((C58684b) C86312j.m106911c(cls)).mo13272V1(context2, intent);
                    }
                } else if (i3 == 2 && (vaVar.field_extFlag & 16) > 0) {
                    ((C58417y0) C86312j.m106911c(cls3)).Wx0(vaVar.field_type, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                    FinderMsgContract.MsgViewCallback msgViewCallback2 = this.f160420d;
                    C60798d2 d2Var = msgViewCallback2.f160400t;
                    if (d2Var != null) {
                        d2Var.mo85581g();
                    }
                    C46547x1 x1Var = msgViewCallback2.f160398r;
                    if (x1Var != null) {
                        x1Var.mo85581g();
                    }
                    long j = vaVar.field_refVideoObjectId;
                    String str2 = vaVar.field_refVideoObjectNonceId;
                    C87412m.m108593f(str2, "mention.field_refVideoObjectNonceId");
                    C13442s8 f3 = C13442s8.f38060Q0.mo12873f(msgViewCallback2.f160390g);
                    if (f3 != null) {
                        hj12 = f3.mo12861q3();
                    }
                    C60798d2 d2Var2 = new C60798d2(j, "", str2, 0, hj12, 8, (C8480h) null);
                    msgViewCallback2.f160400t = d2Var2;
                    C89059e i4 = d2Var2.mo9225i();
                    i4.mo11397F(msgViewCallback2.f160390g);
                    i4.mo123062e(new FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1(msgViewCallback2, vaVar));
                } else if (i3 != 4) {
                    ((C58417y0) C86312j.m106911c(cls3)).Wx0(vaVar.field_type, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                    C46547x1 x1Var2 = this.f160420d.f160398r;
                    if (x1Var2 != null) {
                        x1Var2.mo85581g();
                    }
                    FinderMsgContract.MsgViewCallback.m64243D(this.f160420d, vaVar);
                } else {
                    Class cls4 = cls3;
                    ((C58417y0) C86312j.m106911c(cls3)).Wx0(vaVar.field_type, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                    C64580ne1 ne12 = vaVar.field_notify;
                    if (ne12 != null) {
                        FinderMsgContract.MsgViewCallback msgViewCallback3 = this.f160420d;
                        C115669n nVar = C115669n.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        sb.append(vaVar.field_notify.f184468f);
                        sb.append(",2,");
                        sb.append(C61926c.m72691p(vaVar.field_id));
                        sb.append(',');
                        sb.append(C66785b.f191882e.mo90662O5());
                        sb.append(',');
                        String str3 = ne12.f184472j;
                        sb.append(str3 != null ? C112551y.m153814n(str3, ",", ";", false) : "");
                        nVar.kvStat(20849, sb.toString());
                        int i5 = ne12.f184468f;
                        if (i5 == 1) {
                            MMActivity mMActivity = msgViewCallback3.f160390g;
                            String str4 = ne12.f184470h;
                            String str5 = ne12.f184469g;
                            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                            appBrandStatObject.f245533f = JsApiUpdateAppContact.CTRL_INDEX;
                            C13598b0 b0Var = C13598b0.f38549a;
                            ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(mMActivity, str4, "", 0, 0, str5, appBrandStatObject);
                        } else if (i5 == 2) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("rawUrl", ne12.f184469g);
                            C88144b.m109791i(msgViewCallback3.f160390g, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                        } else if (i5 == 3 || i5 == 4) {
                            C46547x1 x1Var3 = msgViewCallback3.f160398r;
                            if (x1Var3 != null) {
                                x1Var3.mo85581g();
                            }
                            FinderMsgContract.MsgViewCallback.m64243D(msgViewCallback3, vaVar);
                        } else if (i5 == 6 && (finderJumpInfo = ne12.f184473n) != null) {
                            C11920q qVar = new C11920q(finderJumpInfo);
                            C62262d0 d0Var = C62262d0.f176978a;
                            Context context3 = oVar.f173499A;
                            C87412m.m108593f(context3, "holder.context");
                            C11920q qVar2 = qVar;
                            C62262d0.m73168c(d0Var, context3, qVar2, 6, (C60905o) null, 8, (Object) null);
                            Context context4 = oVar.f173499A;
                            C87412m.m108593f(context4, "holder.context");
                            ((C58417y0) C86312j.m106911c(cls4)).Wy0(context4, qVar2, vaVar.field_id, true);
                        }
                    }
                }
            }
        }
    }
}
