package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import bd1.C54446b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75355a0;
import di3.C86312j;
import er1.C7865r3;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import q31.C118148a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C49701hg1;
import te3.C49712hj1;
import te3.C50259lg1;
import tf0.C64916p1;
import up1.C37521f;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;
import zs1.C53806d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<B#\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b;\u0010?J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R2\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006@"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostOriginView;", "Landroid/widget/FrameLayout;", "Lte3/lg1;", "getSelectOriginTypeItem", "", "", "", "getDynamicParams", "", "n", "Z", "getNoEntrance", "()Z", "setNoEntrance", "(Z)V", "noEntrance", "o", "isShowNormal", "setShowNormal", "p", "isForbidden", "setForbidden", "Landroid/content/Intent;", "q", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "intent", "", "r", "J", "getLocalId", "()J", "setLocalId", "(J)V", "localId", "Lcom/tencent/mm/ui/widget/MMSwitchBtn$b;", "s", "Lcom/tencent/mm/ui/widget/MMSwitchBtn$b;", "getSwitchListener", "()Lcom/tencent/mm/ui/widget/MMSwitchBtn$b;", "setSwitchListener", "(Lcom/tencent/mm/ui/widget/MMSwitchBtn$b;)V", "switchListener", "Lkotlin/Function1;", "Lrx3/b0;", "y", "Lfy3/l;", "getOnSelectTypeItem", "()Lfy3/l;", "setOnSelectTypeItem", "(Lfy3/l;)V", "onSelectTypeItem", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderPostOriginView */
public final class FinderPostOriginView extends FrameLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f17904B = 0;

    /* renamed from: A */
    public boolean f17905A;

    /* renamed from: d */
    public final float f17906d = (((float) C7865r3.f26468a.mo8968a()) * 0.75f);

    /* renamed from: e */
    public final View f17907e;

    /* renamed from: f */
    public final MMSwitchBtn f17908f;

    /* renamed from: g */
    public final View f17909g;

    /* renamed from: h */
    public final TextView f17910h;

    /* renamed from: i */
    public final View f17911i;

    /* renamed from: j */
    public TextView f17912j;

    /* renamed from: n */
    public boolean f17913n;

    /* renamed from: o */
    public boolean f17914o;

    /* renamed from: p */
    public boolean f17915p;

    /* renamed from: q */
    public Intent f17916q;

    /* renamed from: r */
    public long f17917r;

    /* renamed from: s */
    public MMSwitchBtn.C7041b f17918s;

    /* renamed from: t */
    public C104428a f17919t;

    /* renamed from: u */
    public C41592j f17920u;

    /* renamed from: v */
    public final String f17921v = C37521f.f99374d.mo61189o();

    /* renamed from: w */
    public int f17922w = -1;

    /* renamed from: x */
    public final ArrayList<String> f17923x = new ArrayList<>();

    /* renamed from: y */
    public C32226l<? super C50259lg1, C13598b0> f17924y;

    /* renamed from: z */
    public boolean f17925z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostOriginView$a */
    public static final class C3970a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderPostOriginView f17926a;

        public C3970a(FinderPostOriginView finderPostOriginView) {
            this.f17926a = finderPostOriginView;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return this.f17926a.getDynamicParams();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostOriginView$b */
    public static final class C3971b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostOriginView f17927d;

        public C3971b(FinderPostOriginView finderPostOriginView) {
            this.f17927d = finderPostOriginView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f17927d.f17919t = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPostOriginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cve, this, true);
        C87412m.m108593f(inflate, "getInflater(context).inf…in_item_view, this, true)");
        this.f17907e = inflate;
        View findViewById = findViewById(C0966R.C0970id.n08);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_post_origin_check_btn)");
        this.f17908f = (MMSwitchBtn) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.n0_);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_post_origin_check_cover)");
        this.f17909g = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.n2r);
        C87412m.m108593f(findViewById3, "findViewById(R.id.post_origin_item_title)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.n2q);
        C87412m.m108593f(findViewById4, "findViewById(R.id.post_origin_item_hint)");
        this.f17910h = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.n39);
        findViewById5.setOnClickListener(new C4219y3(this));
        this.f17911i = findViewById5;
    }

    /* renamed from: c */
    public static final void m4213c(FinderPostOriginView finderPostOriginView) {
        C104428a aVar = finderPostOriginView.f17919t;
        if (aVar != null) {
            aVar.dismiss();
        }
        finderPostOriginView.f17908f.setCheck(true);
        int i = 0;
        finderPostOriginView.mo4669f(true, false);
        C13604l[] lVarArr = new C13604l[2];
        lVarArr[0] = new C13604l("original_statement_type", Integer.valueOf(finderPostOriginView.f17905A ? 1 : 0));
        C50259lg1 selectOriginTypeItem = finderPostOriginView.getSelectOriginTypeItem();
        if (selectOriginTypeItem != null) {
            i = selectOriginTypeItem.f137398d;
        }
        lVarArr[1] = new C13604l("original_type", Integer.valueOf(i));
        Map f = C90364q0.m113147f(lVarArr);
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(finderPostOriginView, "set_original_statement");
        eVar.E60(finderPostOriginView, new C4096l4(finderPostOriginView));
        eVar.mo86153W7("view_clk", finderPostOriginView, f, 25496);
    }

    /* renamed from: d */
    public static final void m4214d(FinderPostOriginView finderPostOriginView, boolean z) {
        if (finderPostOriginView.f17920u == null) {
            Context context = finderPostOriginView.getContext();
            C87412m.m108593f(context, "context");
            C53806d dVar = new C53806d(context);
            C41592j jVar = new C41592j(dVar, finderPostOriginView.f17921v);
            finderPostOriginView.f17920u = jVar;
            jVar.f111958f = new C4104m4(finderPostOriginView);
            ScrollFrameLayout e = dVar.mo74379e();
            C85875k4.m106189j0(((TextView) e.findViewById(C0966R.C0970id.n2l)).getPaint(), 0.8f);
            Button button = (Button) e.findViewById(C0966R.C0970id.n2o);
            Button button2 = (Button) e.findViewById(C0966R.C0970id.n2n);
            View findViewById = e.findViewById(C0966R.C0970id.n2p);
            float dimension = finderPostOriginView.f17906d - e.getContext().getResources().getDimension(C0966R.dimen.f3729ci);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = (int) dimension;
            findViewById.setLayoutParams(layoutParams);
            if (!z) {
                button.setVisibility(8);
            } else {
                button.setOnClickListener(new C4238z3(finderPostOriginView));
            }
            button2.setOnClickListener(new C4014a4(finderPostOriginView));
        }
        C41592j jVar2 = finderPostOriginView.f17920u;
        if (jVar2 != null) {
            Log.m105925i("Finder.AnnounceWebViewDialogWrapper", "showDialog showAfterWebViewReady: %b, webViewReady: %b", Boolean.FALSE, Boolean.valueOf(jVar2.f111955c));
            Log.m105924i("Finder.AnnounceWebViewDialogWrapper", "realShow");
            jVar2.f111953a.show();
        }
    }

    /* access modifiers changed from: private */
    public final Map<String, Object> getDynamicParams() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        Integer num = null;
        C49712hj1 q3 = gr02 != null ? gr02.mo12861q3() : null;
        C13604l[] lVarArr = new C13604l[4];
        lVarArr[0] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
        lVarArr[1] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
        lVarArr[2] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
        if (q3 != null) {
            num = Integer.valueOf(q3.f134675i);
        }
        lVarArr[3] = new C13604l("comment_scene", num);
        return C90364q0.m113147f(lVarArr);
    }

    /* access modifiers changed from: private */
    public final C50259lg1 getSelectOriginTypeItem() {
        C49701hg1 hg12;
        LinkedList<C50259lg1> linkedList;
        int size = this.f17923x.size();
        int i = this.f17922w;
        T t = null;
        if (!(i >= 0 && i < size)) {
            return null;
        }
        String str = this.f17923x.get(i);
        C87412m.m108593f(str, "typeNameList[index]");
        String str2 = str;
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        if (a == null || (hg12 = a.mo75251m2().f132492I) == null || (linkedList = hg12.f134612d) == null) {
            return null;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C112551y.m153810j(((C50259lg1) next).f137399e, str2, false, 2, (Object) null)) {
                t = next;
                break;
            }
        }
        return (C50259lg1) t;
    }

    /* renamed from: e */
    public final void mo4668e() {
        View view = this.f17909g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "hideCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "hideCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public final void mo4669f(boolean z, boolean z2) {
        Log.m105924i("Finder.PostOriginView", "onStatusChange isCheck:" + z);
        Intent intent = this.f17916q;
        if (intent != null) {
            intent.putExtra("ORIGIN_POST_FLAG", z ? 1 : 0);
        }
        if (z) {
            mo4668e();
        } else {
            this.f17922w = -1;
            View view = this.f17909g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "showCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "showCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        MMSwitchBtn.C7041b bVar = this.f17918s;
        if (bVar != null) {
            bVar.onStatusChange(z);
        }
        if (z2) {
            MMSwitchBtn mMSwitchBtn = this.f17908f;
            Map b = C90363p0.m113143b(new C13604l("original_statement_type", Integer.valueOf(this.f17905A ? 1 : 0)));
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            eVar.o30(mMSwitchBtn, "original_statement");
            eVar.E60(mMSwitchBtn, new C4096l4(this));
            eVar.mo86153W7("view_clk", mMSwitchBtn, b, 25496);
        }
    }

    /* renamed from: g */
    public final void mo4670g(View view, String str, int i, Map<String, ? extends Object> map) {
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, str);
        if (map != null) {
            eVar.mo86149PM(view, map);
        }
        eVar.mo86175pO(view, i, 25496);
        eVar.E60(view, new C3970a(this));
    }

    public final Intent getIntent() {
        return this.f17916q;
    }

    public final long getLocalId() {
        return this.f17917r;
    }

    public final boolean getNoEntrance() {
        return this.f17913n;
    }

    public final C32226l<C50259lg1, C13598b0> getOnSelectTypeItem() {
        return this.f17924y;
    }

    public final MMSwitchBtn.C7041b getSwitchListener() {
        return this.f17918s;
    }

    /* renamed from: h */
    public final void mo4676h() {
        TextView textView;
        int size = this.f17923x.size();
        int i = this.f17922w;
        boolean z = false;
        if (i >= 0 && i < size) {
            z = true;
        }
        if (z && (textView = this.f17912j) != null) {
            textView.setText(this.f17923x.get(i));
        }
    }

    /* renamed from: i */
    public final void mo4677i(boolean z, boolean z2) {
        LinkedList<C50259lg1> linkedList;
        Intent intent;
        Window window;
        View decorView;
        Window window2;
        if (this.f17919t == null) {
            C49701hg1 hg12 = null;
            View inflate = LayoutInflater.from(getContext()).inflate(z ? C0966R.C0971layout.cvh : C0966R.C0971layout.cvg, (ViewGroup) null, false);
            C104428a aVar = new C104428a(getContext(), C0966R.style.f8363ft);
            this.f17919t = aVar;
            aVar.setContentView(inflate);
            ViewParent parent = inflate.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior.m139527y((View) parent);
            C104428a aVar2 = this.f17919t;
            if (!(aVar2 == null || (window2 = aVar2.getWindow()) == null)) {
                window2.setDimAmount(0.5f);
            }
            C104428a aVar3 = this.f17919t;
            if (!(aVar3 == null || (window = aVar3.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundResource(C0966R.C0969drawable.aqh);
            }
            C104428a aVar4 = this.f17919t;
            if (aVar4 != null) {
                aVar4.setOnDismissListener(new C3971b(this));
            }
            if (z) {
                C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.n37)).getPaint(), 0.8f);
                inflate.findViewById(C0966R.C0970id.n07).setOnClickListener(new C4058g4(this));
                FinderPostAnnounceItemsView finderPostAnnounceItemsView = (FinderPostAnnounceItemsView) inflate.findViewById(C0966R.C0970id.n2y);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C13604l(finderPostAnnounceItemsView.getContext().getResources().getString(C0966R.string.mgt), finderPostAnnounceItemsView.getContext().getResources().getString(C0966R.string.mgs)));
                arrayList.add(new C13604l(finderPostAnnounceItemsView.getContext().getResources().getString(C0966R.string.mgv), finderPostAnnounceItemsView.getContext().getResources().getString(C0966R.string.mgu)));
                finderPostAnnounceItemsView.mo4667a(arrayList);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358944n31);
                String string = inflate.getContext().getResources().getString(C0966R.string.mgr);
                C87412m.m108593f(string, "context.resources.getStr…st_origin_notice_content)");
                String string2 = inflate.getContext().getResources().getString(C0966R.string.mgx, new Object[]{string});
                C87412m.m108593f(string2, "context.resources.getStr…ced_prefix, announceName)");
                SpannableString spannableString = new SpannableString(string2);
                spannableString.setSpan(new C4059g5(string2, inflate.getContext().getResources().getColor(C0966R.color.Link_100), inflate.getContext().getResources().getColor(C0966R.color.ahf), false, false, new C4067h4(this)), string2.length() - string.length(), string2.length(), 17);
                textView.setOnTouchListener(new C75355a0(inflate.getContext()));
                textView.setText(spannableString);
            } else {
                this.f17923x.clear();
                Context context = getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                int i = -1;
                if (!(activity == null || (intent = activity.getIntent()) == null)) {
                    i = intent.getIntExtra("postType", -1);
                }
                C66785b bVar = C66785b.f191882e;
                C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
                if (a != null) {
                    hg12 = a.mo75251m2().f132492I;
                }
                if (!(hg12 == null || (linkedList = hg12.f134612d) == null)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T next : linkedList) {
                        if (((C50259lg1) next).f137400f.contains(Integer.valueOf(i))) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList<String> arrayList3 = this.f17923x;
                        String str = ((C50259lg1) it.next()).f137399e;
                        if (str == null) {
                            str = "";
                        }
                        arrayList3.add(str);
                    }
                }
                C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.n2x)).getPaint(), 0.8f);
                Button button = (Button) inflate.findViewById(C0966R.C0970id.f358943n30);
                button.setEnabled(false);
                C85875k4.m106189j0(button.getPaint(), 0.8f);
                button.setOnClickListener(new C4053f4(this));
                C13604l[] lVarArr = new C13604l[2];
                lVarArr[0] = new C13604l("original_statement_type", Integer.valueOf(this.f17905A ? 1 : 0));
                C50259lg1 selectOriginTypeItem = getSelectOriginTypeItem();
                lVarArr[1] = new C13604l("original_type", Integer.valueOf(selectOriginTypeItem != null ? selectOriginTypeItem.f137398d : 0));
                Map f = C90364q0.m113147f(lVarArr);
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                eVar.o30(button, "set_original_statement");
                eVar.E60(button, new C4096l4(this));
                eVar.mo86153W7("view_exp", button, f, 25496);
                CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.n2t);
                checkBox.setOnCheckedChangeListener(new C4049e4(button));
                NeatTextView neatTextView = (NeatTextView) inflate.findViewById(C0966R.C0970id.n2v);
                String string3 = inflate.getContext().getResources().getString(C0966R.string.mgr);
                C87412m.m108593f(string3, "context.resources.getStr…st_origin_notice_content)");
                String string4 = inflate.getContext().getResources().getString(C0966R.string.mgw, new Object[]{string3});
                C87412m.m108593f(string4, "context.resources.getStr…ice_prefix, announceName)");
                SpannableString spannableString2 = new SpannableString(string4);
                spannableString2.setSpan(new C4059g5(string4, inflate.getContext().getResources().getColor(C0966R.color.Link_100), inflate.getContext().getResources().getColor(C0966R.color.ahf), false, false, new C4019b4(this)), string4.length() - string3.length(), string4.length(), 17);
                FinderPostAnnounceItemsView finderPostAnnounceItemsView2 = (FinderPostAnnounceItemsView) inflate.findViewById(C0966R.C0970id.n2s);
                ArrayList arrayList4 = new ArrayList();
                if (this.f17905A) {
                    arrayList4.add(new C13604l(finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.f8156pr), finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.f8155pp)));
                }
                arrayList4.add(new C13604l(finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.mgt), finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.mgs)));
                arrayList4.add(new C13604l(finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.mgv), finderPostAnnounceItemsView2.getContext().getResources().getString(C0966R.string.mgu)));
                finderPostAnnounceItemsView2.mo4667a(arrayList4);
                neatTextView.setOnTouchListener(new C75355a0(inflate.getContext()));
                neatTextView.mo104279b(spannableString2);
                neatTextView.setOnClickListener(new C4031c4(checkBox));
                ((FrameLayout) inflate.findViewById(C0966R.C0970id.ons)).setOnClickListener(new C4036d4(checkBox));
                if (!this.f17923x.isEmpty()) {
                    View findViewById = inflate.findViewById(C0966R.C0970id.o2f);
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderPostOriginView", "initOriginType", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setOnClickListener(new C4072i4(this));
                    this.f17912j = (TextView) findViewById.findViewById(C0966R.C0970id.o2g);
                    mo4676h();
                }
                if (z2) {
                    checkBox.setChecked(true);
                    button.setEnabled(true);
                }
            }
        }
        C104428a aVar6 = this.f17919t;
        if (aVar6 != null) {
            aVar6.show();
        }
    }

    public void onFinishInflate() {
        String str;
        super.onFinishInflate();
        C58961d.C58963b bVar = C58961d.f168673a;
        C66785b bVar2 = C66785b.f191882e;
        C58969q b = bVar.mo84155b(bVar2.mo90662O5());
        long j = b != null ? b.field_additionalFlag : 0;
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99474o4.mo60266n().intValue();
        this.f17913n = (intValue == 0 && (j & 1) != 1) || intValue == 3;
        int i = ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1));
        int i2 = ((j & 2) > 2 ? 1 : ((j & 2) == 2 ? 0 : -1));
        this.f17914o = ((i == 0) && (i2 != 0)) || intValue == 2;
        this.f17915p = ((i == 0) && (i2 == 0)) || intValue == 1;
        this.f17905A = (j & 64) == 64 || C37521f.f99484p4.mo60266n().intValue() == 1;
        Log.m105924i("Finder.PostOriginView", "noEntrance:" + this.f17913n + " isShowNormal:" + this.f17914o + " isForbidden:" + this.f17915p + " userExtFlag:" + j + " ruleUrl:" + this.f17921v + " hasAdsSharePlan:" + this.f17905A);
        mo4670g(this.f17907e, "original_statement", 32, C90363p0.m113143b(new C13604l("original_statement_type", Integer.valueOf(this.f17905A ? 1 : 0))));
        if (this.f17913n) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (this.f17915p) {
            this.f17908f.setEnabled(false);
            this.f17908f.setOffColor(getContext().getResources().getColor(C0966R.color.FG_3));
            this.f17910h.setVisibility(0);
            C54446b c = C66783a.C66784a.m78800c(bVar2, false, 1, (Object) null);
            if (c == null || (str = c.mo75251m2().f132487D) == null) {
                str = "";
            }
            if (!Util.isNullOrNil(str)) {
                this.f17910h.setText(str);
                return;
            }
            return;
        }
        if (this.f17905A) {
            this.f17910h.setVisibility(0);
            this.f17910h.setText(getContext().getResources().getString(C0966R.string.f8154ph));
        }
        this.f17908f.setOffColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        this.f17908f.setSwitchListener(new C4079j4(this));
        this.f17909g.setOnClickListener(new C4086k4(this));
    }

    public final void setForbidden(boolean z) {
        this.f17915p = z;
    }

    public final void setIntent(Intent intent) {
        this.f17916q = intent;
    }

    public final void setLocalId(long j) {
        this.f17917r = j;
    }

    public final void setNoEntrance(boolean z) {
        this.f17913n = z;
    }

    public final void setOnSelectTypeItem(C32226l<? super C50259lg1, C13598b0> lVar) {
        this.f17924y = lVar;
    }

    public final void setShowNormal(boolean z) {
        this.f17914o = z;
    }

    public final void setSwitchListener(MMSwitchBtn.C7041b bVar) {
        this.f17918s = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPostOriginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cve, this, true);
        C87412m.m108593f(inflate, "getInflater(context).inf…in_item_view, this, true)");
        this.f17907e = inflate;
        View findViewById = findViewById(C0966R.C0970id.n08);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_post_origin_check_btn)");
        this.f17908f = (MMSwitchBtn) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.n0_);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_post_origin_check_cover)");
        this.f17909g = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.n2r);
        C87412m.m108593f(findViewById3, "findViewById(R.id.post_origin_item_title)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.n2q);
        C87412m.m108593f(findViewById4, "findViewById(R.id.post_origin_item_hint)");
        this.f17910h = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.n39);
        findViewById5.setOnClickListener(new C4219y3(this));
        this.f17911i = findViewById5;
    }
}
