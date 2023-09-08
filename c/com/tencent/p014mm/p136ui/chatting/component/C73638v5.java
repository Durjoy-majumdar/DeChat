package com.tencent.p014mm.p136ui.chatting.component;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.WCWebUpdater;
import fy3.C32227p;
import g13.C75824d;
import gy3.C87412m;
import gy3.C87413o;
import java.util.UUID;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.v5 */
public final class C73638v5 extends C87413o implements C32227p<C73537m5.C73538a, C73537m5.C73538a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216228d;

    /* renamed from: e */
    public final /* synthetic */ TextView f216229e;

    /* renamed from: f */
    public final /* synthetic */ WeImageView f216230f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73638v5(C73537m5 m5Var, TextView textView, WeImageView weImageView) {
        super(2);
        this.f216228d = m5Var;
        this.f216229e = textView;
        this.f216230f = weImageView;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        C73537m5.C73538a aVar = (C73537m5.C73538a) obj2;
        C87412m.m108594g((C73537m5.C73538a) obj, "oldStatus");
        C87412m.m108594g(aVar, "newStatus");
        ViewGroup viewGroup = this.f216228d.f216020i;
        if (viewGroup != null) {
            int i = 0;
            if (aVar == C73537m5.C73538a.BarStatusEmpty) {
                i = 8;
            } else {
                if (viewGroup.getVisibility() != 0) {
                    C73537m5.C73539b bVar = this.f216228d.f216011B;
                    bVar.getClass();
                    MultiProcessMMKV.getMMKV(C73537m5.this.mo102527d6()).putInt(bVar.mo102538a("useTrans"), MultiProcessMMKV.getMMKV(C73537m5.this.mo102527d6()).getInt(bVar.mo102538a("useTrans"), 0) + 1);
                    String r = this.f216228d.f215752d.mo91577r();
                    C87412m.m108593f(r, "mChattingContext.talkerUserName");
                    TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
                    if (C75824d.f222434a.length() == 0) {
                        str = UUID.randomUUID().toString();
                        C87412m.m108593f(str, "randomUUID().toString()");
                        C75824d.f222434a = str;
                    } else {
                        str = C75824d.f222434a;
                    }
                    translateMsgStruct.mo93199u(str);
                    translateMsgStruct.f194636f = 1;
                    translateMsgStruct.mo93197s(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                    translateMsgStruct.mo93198t(r);
                    translateMsgStruct.mo86054n();
                }
                if (aVar == C73537m5.C73538a.BarStatusTranslating) {
                    LoadableTextView loadableTextView = this.f216228d.f216022n;
                    if (loadableTextView != null) {
                        if (loadableTextView.getOriginText().length() == 0) {
                            ViewGroup viewGroup2 = this.f216228d.f216020i;
                            if (viewGroup2 != null) {
                                viewGroup2.setEnabled(false);
                                this.f216229e.setTextColor(this.f216228d.f215752d.mo91565f().getResources().getColor(C0966R.color.f3309nb));
                                this.f216230f.setIconColor(this.f216228d.f215752d.mo91565f().getResources().getColor(C0966R.color.f3309nb));
                            } else {
                                C87412m.m108603p("useBtn");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("resultTv");
                        throw null;
                    }
                }
                ViewGroup viewGroup3 = this.f216228d.f216020i;
                if (viewGroup3 != null) {
                    viewGroup3.setEnabled(true);
                    this.f216229e.setTextColor(this.f216228d.f215752d.mo91565f().getResources().getColor(C0966R.color.f2939n));
                    this.f216230f.setIconColor(this.f216228d.f215752d.mo91565f().getResources().getColor(C0966R.color.f2939n));
                } else {
                    C87412m.m108603p("useBtn");
                    throw null;
                }
            }
            viewGroup.setVisibility(i);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("useBtn");
        throw null;
    }
}
