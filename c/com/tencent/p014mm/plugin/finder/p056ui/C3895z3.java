package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kf1.C9707f;
import kotlin.Result;
import kotlin.ResultKt;
import p629ny.C76979h;
import rs1.C13442s8;
import rs1.C63575n3;
import rx3.C13598b0;
import rx3.C36570n;
import t91.C64208c;

/* renamed from: com.tencent.mm.plugin.finder.ui.z3 */
public final class C3895z3 extends C87413o implements C32226l<FinderObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17475d;

    /* renamed from: e */
    public final /* synthetic */ ShareRelPresenter f17476e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3895z3(FinderShareFeedRelUI finderShareFeedRelUI, ShareRelPresenter shareRelPresenter) {
        super(1);
        this.f17475d = finderShareFeedRelUI;
        this.f17476e = shareRelPresenter;
    }

    public Object invoke(Object obj) {
        Object obj2;
        FinderObject finderObject = (FinderObject) obj;
        Class cls = C58417y0.class;
        Class cls2 = C76979h.class;
        C87412m.m108594g(finderObject, LocaleUtil.ITALIAN);
        this.f17475d.mo4134g8(false);
        this.f17475d.mo4135i8(false);
        FinderShareFeedRelUI finderShareFeedRelUI = this.f17475d;
        FinderContact finderContact = finderObject.contact;
        finderShareFeedRelUI.f17172x0 = finderContact;
        finderShareFeedRelUI.f17174y0 = finderObject;
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = finderShareFeedRelUI.f17169v;
        String str = null;
        if (finderFeedShareRelativeListLoader != null) {
            String str2 = finderContact != null ? finderContact.username : null;
            if (str2 == null) {
                str2 = "";
            }
            finderFeedShareRelativeListLoader.f13578x = str2;
            if (finderShareFeedRelUI.f17155X || this.f17476e.f29961d.getIntent().hasExtra("key_extra_info")) {
                ShareRelPresenter shareRelPresenter = this.f17476e;
                long j = finderObject.f164794id;
                shareRelPresenter.f30772w = j;
                FinderShareFeedRelUI finderShareFeedRelUI2 = this.f17475d;
                finderShareFeedRelUI2.f17138M = j;
                FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = finderShareFeedRelUI2.f17169v;
                if (finderFeedShareRelativeListLoader2 != null) {
                    finderFeedShareRelativeListLoader2.f13561d = j;
                    C13442s8.C13443a aVar = C13442s8.f38060Q0;
                    C13442s8 f = aVar.mo12873f(shareRelPresenter.f29961d);
                    if (f != null) {
                        long j2 = this.f17475d.f17138M;
                        FinderContact finderContact2 = finderObject.contact;
                        f.mo12848O3(j2, finderContact2 != null ? finderContact2.username : null);
                    }
                    FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader3 = this.f17475d.f17169v;
                    if (finderFeedShareRelativeListLoader3 != null) {
                        C13442s8 f2 = aVar.mo12873f(this.f17476e.f29961d);
                        finderFeedShareRelativeListLoader3.setContextObj(f2 != null ? f2.mo12861q3() : null);
                        FinderShareFeedRelUI finderShareFeedRelUI3 = this.f17475d;
                        FinderFeedSnsAdHandler finderFeedSnsAdHandler = finderShareFeedRelUI3.f17144R0;
                        if (finderFeedSnsAdHandler != null) {
                            finderFeedSnsAdHandler.f13031k = finderShareFeedRelUI3.f17172x0;
                        }
                    } else {
                        C87412m.m108603p("loader");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            }
            C64208c.C64209a aVar2 = C64208c.f181951a;
            String stringExtra = this.f17476e.f29961d.getIntent().getStringExtra("key_extra_info");
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader4 = this.f17475d.f17169v;
            if (finderFeedShareRelativeListLoader4 != null) {
                aVar2.mo89032g(stringExtra, finderFeedShareRelativeListLoader4.f13578x);
                this.f17475d.mo4133f8(finderObject.contact);
                FinderShareFeedRelUI finderShareFeedRelUI4 = this.f17475d;
                FinderContact finderContact3 = finderObject.contact;
                finderShareFeedRelUI4.getClass();
                boolean z = true;
                if (finderContact3 != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        String str3 = finderContact3.nickname;
                        if (finderShareFeedRelUI4.f17155X) {
                            if (!finderShareFeedRelUI4.f17157Y) {
                                if (!Util.isNullOrNil(str3)) {
                                    finderShareFeedRelUI4.setMMTitle((CharSequence) ((C76979h) C86312j.m106911c(cls2)).mo107057T1(MMApplicationContext.getContext(), str3));
                                    finderShareFeedRelUI4.f17157Y = true;
                                }
                            }
                        }
                        obj2 = Result.m168114constructorimpl(C13598b0.f38549a);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
                    if (r0 != null) {
                        Log.printErrStackTrace(finderShareFeedRelUI4.f17166s, r0, "", new Object[0]);
                    }
                }
                FinderShareFeedRelUI finderShareFeedRelUI5 = this.f17475d;
                if (!Util.isNullOrNil((String) ((C36570n) finderShareFeedRelUI5.f17175z).getValue())) {
                    finderShareFeedRelUI5.setMMTitle((CharSequence) ((C76979h) C86312j.m106911c(cls2)).mo107057T1(MMApplicationContext.getContext(), (String) ((C36570n) finderShareFeedRelUI5.f17175z).getValue()));
                    finderShareFeedRelUI5.f17157Y = true;
                }
                C9707f fVar = this.f17476e.f29964g;
                RecyclerView recyclerView = fVar != null ? fVar.getRecyclerView() : null;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                FinderShareFeedRelUI finderShareFeedRelUI6 = this.f17475d;
                if (finderShareFeedRelUI6.f17126A != 0 && !finderShareFeedRelUI6.f17146S0) {
                    if (finderShareFeedRelUI6.f17155X) {
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                        ShareRelPresenter shareRelPresenter2 = this.f17476e;
                        long j3 = shareRelPresenter2.f30772w;
                        FinderShareFeedRelUI finderShareFeedRelUI7 = this.f17475d;
                        int i = finderShareFeedRelUI7.f17126A;
                        String str4 = finderShareFeedRelUI7.f17130E;
                        y0Var.iy0(j3, i, 4, str4 == null ? "" : str4, 1, finderShareFeedRelUI7.f17128C, (String) null, ((C13442s8) C39818r.f106831a.mo62444c(shareRelPresenter2.f29961d).mo75002a(C13442s8.class)).f38098n);
                    } else {
                        C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
                        ShareRelPresenter shareRelPresenter3 = this.f17476e;
                        long j4 = shareRelPresenter3.f30772w;
                        FinderShareFeedRelUI finderShareFeedRelUI8 = this.f17475d;
                        int i2 = finderShareFeedRelUI8.f17126A;
                        String str5 = finderShareFeedRelUI8.f17130E;
                        String str6 = str5 == null ? "" : str5;
                        int i3 = finderShareFeedRelUI8.f17128C;
                        C13442s8 f3 = C13442s8.f38060Q0.mo12873f(shareRelPresenter3.f29961d);
                        if (f3 != null) {
                            str = f3.mo12861q3().f134671e;
                        }
                        y0Var2.jy0(j4, i2, str6, 1, i3, str);
                    }
                    this.f17475d.f17146S0 = true;
                }
                C55776r Z7 = this.f17475d.mo4127Z7();
                long j5 = finderObject.f164794id;
                String str7 = finderObject.objectNonceId;
                int i4 = this.f17476e.f29962e;
                boolean z2 = finderObject.secondaryShowFlag != 1;
                String str8 = finderObject.username;
                C55776r.m63515J1(Z7, j5, str7, i4, z2, str8 == null ? "" : str8, 0, (String) null, 96, (Object) null);
                FinderShareFeedRelUI.m3925V7(this.f17475d);
                ShareRelPresenter shareRelPresenter4 = this.f17476e;
                if (finderObject.preview_flag != 1) {
                    z = false;
                }
                shareRelPresenter4.f17206K = z;
                if (z) {
                    FinderShareFeedRelUI finderShareFeedRelUI9 = this.f17475d;
                    C87412m.m108594g(finderShareFeedRelUI9, "ui");
                    finderShareFeedRelUI9.setMMTitle((int) C0966R.string.emy);
                    View findViewById = finderShareFeedRelUI9.findViewById(C0966R.C0970id.a2z);
                    if (findViewById instanceof WeImageView) {
                        WeImageView weImageView = (WeImageView) findViewById;
                        weImageView.setImageResource(C0966R.raw.icons_outlined_close);
                        weImageView.setIconColor(finderShareFeedRelUI9.getResources().getColor(C0966R.color.f3593yt));
                    }
                } else {
                    this.f17475d.mo4126Y7().f42958b.setVisibility(0);
                    ((C63575n3) C39818r.f106831a.mo62444c(this.f17475d).mo75002a(C63575n3.class)).mo88424g3();
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loader");
            throw null;
        }
        C87412m.m108603p("loader");
        throw null;
    }
}
