package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import db2.C58253b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p192l4.C10462b;
import rx3.C13598b0;
import tb2.C64216a;
import te3.C64482k23;
import ub2.C65268c0;
import ub2.C65278d0;
import ub2.C65282e0;
import ub2.C65284f0;
import ub2.C65286g0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView;", "Landroid/widget/RelativeLayout;", "Ltb2/a;", "listener", "Lrx3/b0;", "setViewEventListener", "", "maxWidth", "setMaxWidth", "count", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView */
public final class MusicMvCommentView extends RelativeLayout {

    /* renamed from: i */
    public static final int f163540i = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    /* renamed from: d */
    public ArrayList<C57091a> f163541d;

    /* renamed from: e */
    public WxRecyclerAdapter<C57091a> f163542e;

    /* renamed from: f */
    public int f163543f;

    /* renamed from: g */
    public C64216a f163544g;

    /* renamed from: h */
    public C58253b f163545h;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a */
    public static final class C57091a implements C9493c {

        /* renamed from: d */
        public final C57093c f163546d;

        public C57091a(C57093c cVar) {
            C87412m.m108594g(cVar, "commentItemData");
            this.f163546d = cVar;
        }

        /* renamed from: c */
        public int mo75c() {
            return 2;
        }

        public long getItemId() {
            return (long) this.f163546d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$b */
    public final class C57092b extends C60896i<C57091a> {
        public C57092b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.biu;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
            r8 = (r8 = r5.f163548a).f183874d;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo44e(jq3.C60905o r19, jq3.C9493c r20, int r21, int r22, boolean r23, java.util.List r24) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.C57091a) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "item"
                gy3.C87412m.m108594g(r2, r3)
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r3 = r2.f163546d
                te3.k23 r3 = r3.f163548a
                java.lang.String r3 = r3.f183876f
                r4 = 2131299975(0x7f090e87, float:1.8217967E38)
                android.view.View r4 = r1.mo85812D(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r5 = r2.f163546d
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x0035
                te3.k23 r8 = r5.f163548a
                if (r8 == 0) goto L_0x0035
                te3.i23 r8 = r8.f183874d
                if (r8 == 0) goto L_0x0035
                int r8 = r8.f183594d
                if (r7 != r8) goto L_0x0035
                r8 = 1
                goto L_0x0036
            L_0x0035:
                r8 = 0
            L_0x0036:
                r9 = 0
                if (r8 == 0) goto L_0x00a9
                if (r5 == 0) goto L_0x004a
                te3.k23 r5 = r5.f163548a
                if (r5 == 0) goto L_0x004a
                te3.i23 r5 = r5.f183874d
                if (r5 == 0) goto L_0x004a
                te3.l23 r5 = r5.f183595e
                if (r5 == 0) goto L_0x004a
                java.lang.String r5 = r5.f184027d
                goto L_0x004b
            L_0x004a:
                r5 = r9
            L_0x004b:
                if (r5 == 0) goto L_0x00a9
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r8 = com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.this
                de3.u r10 = new de3.u
                java.lang.Class<ny.h> r11 = p629ny.C76979h.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ny.h r11 = (p629ny.C76979h) r11
                android.content.Context r12 = r8.getContext()
                android.text.SpannableString r5 = r11.mo107057T1(r12, r5)
                r10.<init>((android.text.SpannableString) r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                r3 = 65306(0xff1a, float:9.1513E-41)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                r5.<init>()
                android.text.SpannableStringBuilder r11 = r5.append(r3)
                r11.append(r10)
                int r3 = r3.length()
                if (r3 >= 0) goto L_0x008a
                goto L_0x0203
            L_0x008a:
                android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
                android.content.Context r8 = r8.getContext()
                android.content.res.Resources r8 = r8.getResources()
                r11 = 2131099701(0x7f060035, float:1.7811763E38)
                int r8 = r8.getColor(r11)
                r10.<init>(r8)
                r8 = 33
                r5.setSpan(r10, r6, r3, r8)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00a9
            L_0x00a6:
                r4.setText(r5)
            L_0x00a9:
                r3 = 2131301089(0x7f0912e1, float:1.8220226E38)
                android.view.View r3 = r1.mo85812D(r3)
                r4 = 2131316115(0x7f094d93, float:1.8250702E38)
                android.view.View r1 = r1.mo85812D(r4)
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 == 0) goto L_0x00c5
                com.tencent.mm.plugin.mv.ui.view.a r4 = new com.tencent.mm.plugin.mv.ui.view.a
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r5 = com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.this
                r4.<init>(r2, r5)
                r1.setOnClickListener(r4)
            L_0x00c5:
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r4 = r2.f163546d
                if (r4 == 0) goto L_0x00cf
                te3.k23 r4 = r4.f163548a
                if (r4 == 0) goto L_0x00cf
                java.lang.String r9 = r4.f183884q
            L_0x00cf:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r4 != 0) goto L_0x01b6
                if (r3 != 0) goto L_0x00d8
                goto L_0x011a
            L_0x00d8:
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
                r4.mo10233c(r5)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter"
                java.lang.String r13 = "onBindViewHolder"
                java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r3
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x011a:
                if (r1 != 0) goto L_0x011d
                goto L_0x0120
            L_0x011d:
                r1.setVisibility(r6)
            L_0x0120:
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r2 = r2.f163546d
                if (r2 == 0) goto L_0x012c
                te3.k23 r2 = r2.f163548a
                if (r2 == 0) goto L_0x012c
                java.lang.String r2 = r2.f183884q
                if (r2 != 0) goto L_0x012e
            L_0x012c:
                java.lang.String r2 = ""
            L_0x012e:
                java.lang.String r3 = "referInfoTv"
                gy3.C87412m.m108593f(r1, r3)
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r3 = com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.this
                android.content.Context r3 = r3.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131833283(0x7f1131c3, float:1.9299644E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = "的音乐视频"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r3 = 32
                r4.append(r3)
                r4.append(r2)
                java.lang.String r3 = r4.toString()
                r4 = 0
                r5 = 0
                r6 = 6
                r8 = 0
                r19 = r3
                r20 = r2
                r21 = r4
                r22 = r5
                r23 = r6
                r24 = r8
                int r4 = z04.C112550d0.m153772H(r19, r20, r21, r22, r23, r24)
                if (r4 >= 0) goto L_0x0187
                goto L_0x0203
            L_0x0187:
                int r2 = r2.length()
                int r2 = r2 + r4
                android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                r5.<init>(r3)
                android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
                java.lang.String r6 = "#FF7D90A9"
                int r6 = android.graphics.Color.parseColor(r6)
                r3.<init>(r6)
                r6 = 18
                r5.setSpan(r3, r4, r2, r6)
                de3.a0 r2 = new de3.a0
                com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r3 = com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.this
                android.content.Context r3 = r3.getContext()
                r2.<init>(r3)
                r1.setOnTouchListener(r2)
                r1.setClickable(r7)
                r1.setText(r5)
                goto L_0x0203
            L_0x01b6:
                r2 = 8
                if (r3 != 0) goto L_0x01bb
                goto L_0x01fd
            L_0x01bb:
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r4.mo10233c(r5)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter"
                java.lang.String r13 = "onBindViewHolder"
                java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r3
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x01fd:
                if (r1 != 0) goto L_0x0200
                goto L_0x0203
            L_0x0200:
                r1.setVisibility(r2)
            L_0x0203:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.C57092b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c */
    public static final class C57093c {

        /* renamed from: a */
        public C64482k23 f163548a;

        public C57093c(C64482k23 k232) {
            C87412m.m108594g(k232, "msgPack");
            this.f163548a = k232;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$d */
    public static final class C57094d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvCommentView f163549d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C57091a> f163550e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57094d(MusicMvCommentView musicMvCommentView, ArrayList<C57091a> arrayList) {
            super(0);
            this.f163549d = musicMvCommentView;
            this.f163550e = arrayList;
        }

        public Object invoke() {
            this.f163549d.setMaxHeight(this.f163550e.size());
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f163541d = new ArrayList<>();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.biv, this, false);
        addView(inflate);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i2 = C0966R.C0970id.fpp;
        WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(inflate, C0966R.C0970id.fpp);
        if (wxRecyclerView != null) {
            i2 = C0966R.C0970id.f358838hb3;
            RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.f358838hb3);
            if (relativeLayout != null) {
                i2 = C0966R.C0970id.hb4;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.hb4);
                if (textView != null) {
                    this.f163545h = new C58253b(frameLayout, frameLayout, wxRecyclerView, relativeLayout, textView);
                    WxRecyclerAdapter<C57091a> wxRecyclerAdapter = new WxRecyclerAdapter<>(new MusicMvCommentView$prepareViews$1(this), this.f163541d, true);
                    this.f163542e = wxRecyclerAdapter;
                    WxRecyclerView wxRecyclerView2 = this.f163545h.f166797b;
                    if (wxRecyclerView2 != null) {
                        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
                    }
                    WxRecyclerView wxRecyclerView3 = this.f163545h.f166797b;
                    if (wxRecyclerView3 != null) {
                        wxRecyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    }
                    WxRecyclerView wxRecyclerView4 = this.f163545h.f166797b;
                    if (wxRecyclerView4 != null) {
                        wxRecyclerView4.mo17085h0(new C65268c0());
                    }
                    WxRecyclerAdapter<C57091a> wxRecyclerAdapter2 = this.f163542e;
                    if (wxRecyclerAdapter2 != null) {
                        wxRecyclerAdapter2.f173488o = new C65278d0(this);
                        wxRecyclerAdapter2.f173487n = new C65282e0(this);
                        this.f163545h.f166797b.mo17043c(new C65284f0(this));
                        this.f163545h.f166798c.setOnClickListener(new C65286g0(this));
                        setTag(this);
                        return;
                    }
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* renamed from: a */
    public static final void m65811a(MusicMvCommentView musicMvCommentView, Boolean bool) {
        musicMvCommentView.getClass();
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            WxRecyclerView wxRecyclerView = musicMvCommentView.f163545h.f166797b;
            WxRecyclerAdapter<C57091a> wxRecyclerAdapter = musicMvCommentView.f163542e;
            if (wxRecyclerAdapter != null) {
                int itemCount = wxRecyclerAdapter.getItemCount() - 1;
                if (itemCount < 0) {
                    itemCount = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(itemCount));
                WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                C117292a.m165358d(wxRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            WxRecyclerView wxRecyclerView3 = musicMvCommentView.f163545h.f166797b;
            WxRecyclerAdapter<C57091a> wxRecyclerAdapter2 = musicMvCommentView.f163542e;
            if (wxRecyclerAdapter2 != null) {
                int itemCount2 = wxRecyclerAdapter2.getItemCount() - 1;
                if (itemCount2 < 0) {
                    itemCount2 = 0;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(itemCount2));
                WxRecyclerView wxRecyclerView4 = wxRecyclerView3;
                C117292a.m165358d(wxRecyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(wxRecyclerView4, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
        WxRecyclerAdapter<C57091a> wxRecyclerAdapter3 = musicMvCommentView.f163542e;
        if (wxRecyclerAdapter3 != null) {
            musicMvCommentView.f163543f = wxRecyclerAdapter3.getData().size();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo80543b() {
        this.f163545h.f166798c.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (r0 == (r5.getItemCount() - 1)) goto L_0x00ce;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80544c(java.util.ArrayList<com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.C57091a> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "lstConvertData"
            gy3.C87412m.m108594g(r13, r0)
            boolean r0 = r13.isEmpty()
            r1 = 0
            java.lang.String r2 = "adapter"
            r3 = 0
            if (r0 == 0) goto L_0x009e
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r0 = r12.f163542e
            if (r0 == 0) goto L_0x009a
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x001d
            r0.clear()
        L_0x001d:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r0 = r12.f163542e
            if (r0 == 0) goto L_0x0096
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x002a
            r0.addAll(r13)
        L_0x002a:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r0 = r12.f163542e
            if (r0 == 0) goto L_0x0092
            r0.notifyDataSetChanged()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r0 = r12.f163542e
            if (r0 == 0) goto L_0x008e
            int r2 = r0.getItemCount()
            if (r2 <= 0) goto L_0x0087
            db2.b r2 = r12.f163545h
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.f166797b
            int r0 = r0.getItemCount()
            int r0 = r0 + -1
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.mo10233c(r0)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView"
            java.lang.String r6 = "smoothScrollToLastPosition"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "smoothScrollToPosition"
            java.lang.String r10 = "(I)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r11.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.mo17149t1(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView"
            java.lang.String r5 = "smoothScrollToLastPosition"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "smoothScrollToPosition"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0087:
            r12.f163543f = r1
            r12.mo80543b()
            goto L_0x014d
        L_0x008e:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0092:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0096:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x009a:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x009e:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r0 = r12.f163542e
            if (r0 == 0) goto L_0x015a
            int r0 = r0.getItemCount()
            r4 = 1
            if (r0 == 0) goto L_0x00cd
            db2.b r0 = r12.f163545h
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.f166797b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r0, r5)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.mo16959E()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r5 = r12.f163542e
            if (r5 == 0) goto L_0x00c9
            int r5 = r5.getItemCount()
            int r5 = r5 - r4
            if (r0 != r5) goto L_0x00cd
            goto L_0x00ce
        L_0x00c9:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            int r0 = r13.size()
            int r5 = r12.f163543f
            int r0 = r0 - r5
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r5 = r12.f163541d
            int r5 = r5.size()
            db2.b r6 = r12.f163545h
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r6.f166797b
            boolean r6 = r6.isShown()
            java.lang.String r7 = "MicroMsg.MusicMvCommentView"
            if (r6 != 0) goto L_0x00ed
            java.lang.String r1 = "[updateComments] liveCommentListRV is invisible, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x0125
        L_0x00ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "updateComments  before size:"
            r6.append(r8)
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r8 = r12.f163541d
            int r8 = r8.size()
            r6.append(r8)
            java.lang.String r8 = " afterSize:"
            r6.append(r8)
            int r8 = r13.size()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            ub2.j0 r6 = new ub2.j0
            r6.<init>(r12, r13)
            androidx.recyclerview.widget.l$c r1 = androidx.recyclerview.widget.C54248l.m60949a(r6, r1)
            ub2.i0 r6 = new ub2.i0
            r6.<init>(r12, r13)
            r1.mo75045a(r6)
        L_0x0125:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r1 = r12.f163542e
            if (r1 == 0) goto L_0x0156
            int r1 = r1.getItemCount()
            if (r1 <= 0) goto L_0x0146
            if (r4 != 0) goto L_0x013a
            if (r5 != 0) goto L_0x0134
            goto L_0x013a
        L_0x0134:
            if (r0 <= 0) goto L_0x0146
            r12.mo80545d(r0)
            goto L_0x0146
        L_0x013a:
            db2.b r1 = r12.f163545h
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r1.f166797b
            ub2.h0 r2 = new ub2.h0
            r2.<init>(r12)
            r1.post(r2)
        L_0x0146:
            if (r0 <= 0) goto L_0x014a
            if (r4 == 0) goto L_0x014d
        L_0x014a:
            r12.mo80543b()
        L_0x014d:
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$d r0 = new com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$d
            r0.<init>(r12, r13)
            o40.C61926c.m72668M(r0)
            return
        L_0x0156:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x015a:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView.mo80544c(java.util.ArrayList):void");
    }

    /* renamed from: d */
    public final void mo80545d(int i) {
        if (i > 0) {
            this.f163545h.f166798c.setVisibility(0);
            TextView textView = this.f163545h.f166799d;
            String string = getContext().getResources().getString(C0966R.string.h2c);
            C87412m.m108593f(string, "context.resources.getStr…sic_live_new_comment_tip)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
            return;
        }
        mo80543b();
    }

    public final void setMaxHeight(int i) {
        if (i >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f163545h.f166796a.getLayoutParams();
            if (i >= 3 && layoutParams.height < getResources().getDimensionPixelOffset(C0966R.dimen.f3715c8)) {
                layoutParams.height = getResources().getDimensionPixelOffset(C0966R.dimen.f3715c8);
            }
        }
    }

    public final void setMaxWidth(int i) {
        if (i > 0) {
            ViewGroup.LayoutParams layoutParams = this.f163545h.f166796a.getLayoutParams();
            if (i > 0) {
                layoutParams.width = i;
            }
        }
    }

    public final void setViewEventListener(C64216a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f163544g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
