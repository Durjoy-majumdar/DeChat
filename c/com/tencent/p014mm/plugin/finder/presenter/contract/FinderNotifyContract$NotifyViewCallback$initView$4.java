package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58784w3;
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
import p749xh.C66276va;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64580ne1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$initView$4", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$4 */
public final class FinderNotifyContract$NotifyViewCallback$initView$4 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160500d;

    public FinderNotifyContract$NotifyViewCallback$initView$4(FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        this.f160500d = notifyViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        FinderJumpInfo finderJumpInfo;
        RecyclerView.C16613e eVar2 = eVar;
        C60905o oVar = (C60905o) zVar;
        Class cls = C58417y0.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0) {
            FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160500d;
            if (c6 < notifyViewCallback.f160455g.mo78485n(notifyViewCallback.f160452d).size()) {
                FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = this.f160500d;
                C55011a aVar = notifyViewCallback2.f160455g.mo78485n(notifyViewCallback2.f160452d).get(c6);
                C87412m.m108593f(aVar, "presenter.getData(tabIndex)[fixPos]");
                C55011a aVar2 = aVar;
                if (!(aVar2 instanceof C39993q1)) {
                    C66276va vaVar = aVar2.f154465d;
                    FinderNotifyContract.NotifyViewCallback.UICallbackListener uICallbackListener = this.f160500d.f160464s;
                    if (uICallbackListener != null) {
                        uICallbackListener.mo78494J(vaVar);
                    }
                    String str = this.f160500d.f160453e;
                    Log.m105924i(str, "onClick " + c6 + " id:" + vaVar.field_id + " commentId:" + vaVar.field_commentId);
                    FinderNotifyContract.NotifyViewCallback notifyViewCallback3 = this.f160500d;
                    Class cls2 = C58684b.class;
                    FinderNotifyContract.NotifyPresenter notifyPresenter = notifyViewCallback3.f160455g;
                    if (!(notifyPresenter.f160440d == 1 && notifyPresenter.f160441e[notifyViewCallback3.f160452d] == 1 && c6 == 0)) {
                        int i2 = vaVar.field_type;
                        C49712hj1 hj12 = null;
                        if (i2 == 1) {
                            ((C58417y0) C86312j.m106911c(cls)).Vx0(vaVar.field_type, notifyViewCallback3.f160452d + 1, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                            ((C58684b) C86312j.m106911c(cls2)).Gx0(notifyViewCallback3.f160456h, (Intent) null);
                        } else if (i2 == 10 || i2 == 11) {
                            if (i2 == 11 && !Util.isNullOrNil(vaVar.field_username)) {
                                Intent intent = new Intent();
                                C58784w3.f168295a.mo83873H1(intent, notifyViewCallback3.f160455g.f160440d, notifyViewCallback3.f160452d);
                                intent.putExtra("finder_username", vaVar.field_username);
                                C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                                Context context = oVar.f173499A;
                                C87412m.m108593f(context, "holder.context");
                                C13442s8.C13443a.m12791e(aVar3, context, intent, 0, (String) null, 0, 9, false, 0, 192, (Object) null);
                                Context context2 = oVar.f173499A;
                                C87412m.m108593f(context2, "holder.context");
                                ((C58684b) C86312j.m106911c(cls2)).mo13272V1(context2, intent);
                            }
                        } else if (i2 == 2 && (vaVar.field_extFlag & 16) > 0) {
                            int i3 = vaVar.field_type;
                            boolean l2 = vaVar.mo90403l2();
                            ((C58417y0) C86312j.m106911c(cls)).Wx0(i3, l2 ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                            C46547x1 x1Var = notifyViewCallback3.f160463r;
                            if (x1Var != null) {
                                x1Var.mo85581g();
                            }
                            C60798d2 d2Var = notifyViewCallback3.f160468w;
                            if (d2Var != null) {
                                d2Var.mo85581g();
                            }
                            long j = vaVar.field_refVideoObjectId;
                            String str2 = vaVar.field_refVideoObjectNonceId;
                            C87412m.m108593f(str2, "mention.field_refVideoObjectNonceId");
                            C13442s8 f = C13442s8.f38060Q0.mo12873f(notifyViewCallback3.f160456h);
                            if (f != null) {
                                hj12 = f.mo12861q3();
                            }
                            C60798d2 d2Var2 = new C60798d2(j, "", str2, 0, hj12, 8, (C8480h) null);
                            notifyViewCallback3.f160468w = d2Var2;
                            C89059e i4 = d2Var2.mo9225i();
                            i4.mo11397F(notifyViewCallback3.f160456h);
                            i4.mo123062e(new FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1(notifyViewCallback3, vaVar));
                        } else if (i2 != 4) {
                            ((C58417y0) C86312j.m106911c(cls)).Vx0(vaVar.field_type, notifyViewCallback3.f160452d + 1, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                            C46547x1 x1Var2 = notifyViewCallback3.f160463r;
                            if (x1Var2 != null) {
                                x1Var2.mo85581g();
                            }
                            notifyViewCallback3.mo78492k0(vaVar);
                        } else {
                            ((C58417y0) C86312j.m106911c(cls)).Vx0(vaVar.field_type, notifyViewCallback3.f160452d + 1, vaVar.mo90403l2() ? 1 : 0, vaVar.mo90404m2(), aVar2.f154465d.field_objectId);
                            C64580ne1 ne12 = vaVar.field_notify;
                            if (ne12 != null) {
                                int i5 = ne12.f184468f;
                                if (i5 == 1) {
                                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(notifyViewCallback3.f160456h, ne12.f184470h, "", 0, 0, ne12.f184469g, new AppBrandStatObject());
                                } else if (i5 == 2) {
                                    Intent intent2 = new Intent();
                                    intent2.putExtra("rawUrl", ne12.f184469g);
                                    C88144b.m109791i(notifyViewCallback3.f160456h, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                                } else if (i5 == 3 || i5 == 4) {
                                    if (notifyViewCallback3.f160455g.f160440d == 2) {
                                        C46547x1 x1Var3 = notifyViewCallback3.f160463r;
                                        if (x1Var3 != null) {
                                            x1Var3.mo85581g();
                                        }
                                        notifyViewCallback3.mo78492k0(vaVar);
                                    }
                                } else if (i5 == 6 && notifyViewCallback3.f160455g.f160440d == 2 && (finderJumpInfo = ne12.f184473n) != null) {
                                    C62262d0 d0Var = C62262d0.f176978a;
                                    Context context3 = oVar.f173499A;
                                    C87412m.m108593f(context3, "holder.context");
                                    C62262d0.m73168c(d0Var, context3, new C11920q(finderJumpInfo), 0, (C60905o) null, 12, (Object) null);
                                }
                            }
                        }
                    }
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    FinderNotifyContract.NotifyViewCallback notifyViewCallback4 = this.f160500d;
                    C58417y0.fy0((C58417y0) c, notifyViewCallback4.f160456h, 14, 1, false, notifyViewCallback4.f160455g.f160440d, 2, (String) null, 72, (Object) null);
                }
            }
        }
    }
}
