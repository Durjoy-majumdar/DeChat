package com.tencent.p014mm.plugin.finder.feed;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneAuthorLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.HardTouchableLayout;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kf1.C10044x8;
import kf1.C10057y8;
import kotlin.Metadata;
import p145dx.C58457w;
import p145dx.C7522l;
import p145dx.C7523p;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import tf0.C64916p1;
import up1.C27696y;
import ve1.C14590p;
import ve1.C14592p2;
import ve3.C65682g;
import ve3.C65685n0;
import wj2.C66132f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1 */
public final class FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderRingtoneTimelineContract$Presenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1$a */
    public static final class C2555a extends C14592p2 {

        /* renamed from: P */
        public final /* synthetic */ FinderRingtoneTimelineContract$Presenter f13217P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2555a(FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter, FinderVideoCore finderVideoCore, boolean z, int i) {
            super(finderVideoCore, finderRingtoneTimelineContract$Presenter, z, i, false, 16, (C8480h) null);
            this.f13217P = finderRingtoneTimelineContract$Presenter;
        }

        /* renamed from: N */
        public void mo2274N(C60905o oVar, int i, int i2, int i3) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: P */
        public void mo2278P(C60905o oVar, int i) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: R0 */
        public void mo44e(C60905o oVar, C55018j0 j0Var, int i, int i2, boolean z, List<Object> list) {
            C13598b0 b0Var;
            C65682g gVar;
            C60905o oVar2 = oVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(j0Var, "item");
            super.mo44e(oVar, j0Var, i, i2, z, list);
            this.f13217P.getClass();
            int color = oVar2.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_5);
            ViewGroup viewGroup = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.e6u);
            View D = oVar2.mo85812D(C0966R.C0970id.edb);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.a2r) : null;
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar2.mo85812D(C0966R.C0970id.eh4);
            if (D2 != null && (D2 instanceof FinderFullSeekBarLayout)) {
                ((FinderFullSeekBarLayout) D2).setHidePrivateLike(true);
            }
            View D3 = oVar2.mo85812D(C0966R.C0970id.ieh);
            if (D3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view = D3;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D4 = oVar2.mo85812D(C0966R.C0970id.d9e);
            if (D4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view2 = D4;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D5 = oVar2.mo85812D(C0966R.C0970id.d9f);
            if (D5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view3 = D5;
                C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.ec5);
            if (findViewById2 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter", "clearFullVideoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            NeatTextView neatTextView = (NeatTextView) oVar2.mo85812D(C0966R.C0970id.ki5);
            neatTextView.setMaxLines(1);
            neatTextView.setEllipsize(TextUtils.TruncateAt.END);
            neatTextView.setTextColor(color);
            int dimension = (int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3766df);
            neatTextView.setPadding(neatTextView.getPaddingLeft(), dimension, neatTextView.getPaddingRight(), dimension);
            View view5 = oVar2.f44854d;
            SimpleTouchableLayout simpleTouchableLayout = view5 instanceof SimpleTouchableLayout ? (SimpleTouchableLayout) view5 : null;
            if (simpleTouchableLayout != null) {
                simpleTouchableLayout.setOnDoubleClickListener((SimpleTouchableLayout.C4004a) null);
                simpleTouchableLayout.setOnLongClickListener((SimpleTouchableLayout.C4006c) null);
            }
            FinderMediaLayout finderMediaLayout = (FinderMediaLayout) oVar2.mo85812D(C0966R.C0970id.ol_);
            if (finderMediaLayout != null) {
                finderMediaLayout.setOnDoubleClickListener((HardTouchableLayout.C7074a) null);
                finderMediaLayout.setOnLongClickListener((HardTouchableLayout.C7076c) null);
            }
            FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.f13217P;
            finderRingtoneTimelineContract$Presenter.getClass();
            Class cls = C7523p.class;
            Class cls2 = C11990s0.class;
            Class cls3 = C7522l.class;
            Class cls4 = C60200t1.class;
            ((NeatTextView) oVar2.mo85812D(C0966R.C0970id.ki5)).mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(finderRingtoneTimelineContract$Presenter.f29961d, ((C64916p1) C86312j.m106911c(C64916p1.class)).du0(j0Var.mo3513o().getDescription()), oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3879hn)));
            View D6 = oVar2.mo85812D(C0966R.C0970id.mc_);
            if (D6 == null) {
                D6 = ((ViewStub) oVar2.mo85812D(C0966R.C0970id.mca)).inflate();
            }
            FinderObject finderObject = j0Var.mo3513o().getFinderObject();
            FinderContact finderContact = finderObject.contact;
            if (finderContact != null) {
                C58969q f = C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null);
                ImageView imageView = (ImageView) D6.findViewById(C0966R.C0970id.f359101mh2);
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls2)).mo11872i2();
                C62345f fVar = new C62345f(f.field_avatarUrl, (C27696y) null, 2, (C8480h) null);
                C87412m.m108593f(imageView, "avatarIv");
                i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
                RingtoneAuthorLayout ringtoneAuthorLayout = (RingtoneAuthorLayout) D6.findViewById(C0966R.C0970id.f359100mh1);
                TextView textView = (TextView) D6.findViewById(C0966R.C0970id.mha);
                TextView textView2 = (TextView) D6.findViewById(C0966R.C0970id.f359106iv3);
                String unsignedLongString = Util.getUnsignedLongString(finderObject.f164794id);
                ringtoneAuthorLayout.setOnClickListener(new C10044x8(unsignedLongString));
                imageView.setOnClickListener(new C10057y8(unsignedLongString));
                if (!finderRingtoneTimelineContract$Presenter.f13210t) {
                    textView.setText(oVar2.f173499A.getString(C0966R.string.m5x));
                    textView.setVisibility(0);
                }
                C66132f Xz = ((C7523p) C86312j.m106911c(cls)).mo8647Xz(finderObject.f164794id);
                if (Xz != null) {
                    textView2.setText(12300 + Xz.f190085h + 12301);
                    ((C7522l) C86312j.m106911c(cls3)).mo8645FD(ringtoneAuthorLayout, Xz);
                    textView.setVisibility(4);
                    C65685n0 n0Var = Xz.f190083f;
                    if (!(n0Var == null || (gVar = n0Var.f189022f) == null)) {
                        int i3 = gVar.f189008u;
                        if (i3 == 1) {
                            textView.setText(oVar2.f173499A.getString(C0966R.string.m3f, new Object[]{Long.valueOf(gVar.f189006s)}));
                            textView.setVisibility(0);
                        } else if (i3 == 2 || gVar.f189002o >= 10) {
                            textView.setText(oVar2.f173499A.getString(C0966R.string.m3g, new Object[]{((C60200t1) C86312j.m106911c(cls4)).mo76868qS((int) gVar.f189002o)}));
                            textView.setVisibility(0);
                        } else {
                            textView.setVisibility(4);
                        }
                        b0Var = C13598b0.f38549a;
                    }
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C66132f Xz2 = ((C7523p) C86312j.m106911c(cls)).mo8647Xz(finderObject.f164794id);
                    if (Xz2 != null) {
                        textView2.setText(12300 + Xz2.f190086i + 12301);
                        ((C7522l) C86312j.m106911c(cls3)).mo8645FD(ringtoneAuthorLayout, Xz2);
                    } else {
                        String m102 = ((C58457w) C86312j.m106911c(C58457w.class)).m10(finderObject);
                        textView2.setText(12300 + m102 + 12301);
                        ((C7522l) C86312j.m106911c(cls3)).dg0(ringtoneAuthorLayout, finderObject);
                    }
                }
            }
            mo2303l(oVar);
            FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter2 = this.f13217P;
            if (i == finderRingtoneTimelineContract$Presenter2.f13212v) {
                C32226l<? super C60905o, C13598b0> lVar = finderRingtoneTimelineContract$Presenter2.f13213w;
                if (lVar != null) {
                    lVar.invoke(oVar2);
                }
                this.f13217P.f13213w = null;
            }
        }

        /* renamed from: l0 */
        public void mo2304l0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g((C55018j0) baseFinderFeed, "item");
        }

        /* renamed from: m0 */
        public void mo2306m0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.fpi)).setVisibility(8);
        }

        /* renamed from: o0 */
        public void mo2310o0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.egm)).setVisibility(8);
        }
    }

    public FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1(FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter) {
        this.this$0 = finderRingtoneTimelineContract$Presenter;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 4) {
            FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.this$0;
            FinderVideoCore finderVideoCore = finderRingtoneTimelineContract$Presenter.f29969o;
            finderRingtoneTimelineContract$Presenter.getClass();
            FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter2 = this.this$0;
            return new C2555a(finderRingtoneTimelineContract$Presenter2, finderVideoCore, false, finderRingtoneTimelineContract$Presenter2.f29967j);
        }
        C58784w3.f168295a.mo83916b(this.this$0.f13123r, i);
        return new C14590p();
    }
}
