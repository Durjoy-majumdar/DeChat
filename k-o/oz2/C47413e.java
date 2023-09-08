package oz2;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.card.TextStatusCardFeedUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C9556a;
import kg3.C76577a;
import p773yy.C79168k;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C47898p;
import qy2.C77448f0;
import rx3.C36570n;
import uz2.C52691j0;
import yz2.C79284y;
import zz2.C16421b;

/* renamed from: oz2.e */
public final class C47413e extends C60896i<C47412d> {

    /* renamed from: e */
    public final C47896n.C47897a f127196e;

    /* renamed from: f */
    public final String f127197f;

    /* renamed from: oz2.e$a */
    public static final class C47414a implements C47896n.C47897a {

        /* renamed from: a */
        public final /* synthetic */ C47413e f127198a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f127199b;

        /* renamed from: c */
        public final /* synthetic */ RelativeLayout f127200c;

        public C47414a(C47413e eVar, C60905o oVar, RelativeLayout relativeLayout) {
            this.f127198a = eVar;
            this.f127199b = oVar;
            this.f127200c = relativeLayout;
        }

        /* renamed from: a */
        public final void mo67431a(int i, Object obj) {
            C47896n.C47897a aVar = this.f127198a.f127196e;
            if (aVar != null) {
                aVar.mo67431a(i, obj);
            }
            if (i == 2 && C87412m.m108589b(obj, Boolean.TRUE)) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f127199b.f173499A;
                C87412m.m108593f(context, "holder.context");
                TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) rVar.mo62443b(context).mo75002a(TextStatusCardFeedUIC.class);
                if (textStatusCardFeedUIC != null) {
                    textStatusCardFeedUIC.mo67474e3(this.f127200c, 0, 0, false);
                }
            }
        }
    }

    /* renamed from: oz2.e$b */
    public static final class C47415b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f127201d;

        public C47415b(C60905o oVar) {
            this.f127201d = oVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector;
            MotionEvent motionEvent2 = motionEvent;
            Class cls = TextStatusCardFeedUIC.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert$onCreateViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f127201d.f173499A;
            C87412m.m108593f(context, "holder.context");
            TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) rVar.mo62443b(context).mo75002a(cls);
            if (textStatusCardFeedUIC != null) {
                textStatusCardFeedUIC.f117023n = new WeakReference<>(this.f127201d);
            }
            Context context2 = this.f127201d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            TextStatusCardFeedUIC textStatusCardFeedUIC2 = (TextStatusCardFeedUIC) rVar.mo62443b(context2).mo75002a(cls);
            if (textStatusCardFeedUIC2 == null || (gestureDetector = textStatusCardFeedUIC2.f117025p) == null) {
                z = false;
            } else {
                C9556a aVar = new C9556a();
                aVar.mo10233c(motionEvent2);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert$onCreateViewHolder$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
                C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert$onCreateViewHolder$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                z = onTouchEvent;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert$onCreateViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    public C47413e(C47896n.C47897a aVar, String str) {
        this.f127196e = aVar;
        this.f127197f = str;
    }

    /* renamed from: b */
    public C60905o mo25318b(RecyclerView recyclerView, View view) {
        ViewGroup.LayoutParams layoutParams;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "convertView");
        int height = recyclerView.getHeight();
        if (!(height == 0 || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.height = height - C76577a.m92151b(recyclerView.getContext(), 1);
            view.setLayoutParams(layoutParams);
        }
        return new C60905o(view);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cml;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47412d dVar = (C47412d) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        Log.m105918d("MicroMsg.TextStatus.CardFeedItemConvert", "onBindViewHolder() called with: holder = " + oVar + ", item = " + dVar + ", position = " + i + ", type = " + i2 + ", isHotPatch = " + z + ", payloads = " + list);
        Object obj = oVar.f173502D;
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.StatusCardView");
        C79284y yVar = (C79284y) obj;
        yVar.f232762j.setTag(C0966R.C0970id.ke6, Integer.valueOf(i));
        String str = dVar.f127195d.field_UserName;
        C87412m.m108593f(str, "item.info.field_UserName");
        C47898p.C47899a.m53214a(yVar, str, dVar.f127195d, (C52691j0) null, 4, (Object) null);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C47894a0 a0Var;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        Log.m105918d("MicroMsg.TextStatus.CardFeedItemConvert", "onCreateViewHolder() called with: recyclerView = " + recyclerView + ", holder = " + oVar + ", type = " + i);
        View view = oVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) view;
        boolean z = true;
        if (C87412m.m108589b(this.f127197f, "SCENE_HISTORY_FEED")) {
            a0Var = new C47894a0();
            a0Var.f128516d = a0Var.f128516d | 1 | 2;
            a0Var.mo72637c(true);
            a0Var.f128519g = 9;
            a0Var.f128516d = (a0Var.f128516d & -5) | 32;
            a0Var.mo72639d(true);
            a0Var.f128516d = (((a0Var.f128516d & -65 & -129) | 256) & -8193) | 16384;
            a0Var.mo72636b(true);
            a0Var.f128517e = true;
            a0Var.f128518f = true;
            a0Var.f128516d = a0Var.f128516d | 65536 | 131072 | 512;
        } else {
            a0Var = new C47894a0();
            a0Var.f128516d = a0Var.f128516d | 1 | 2;
            a0Var.mo72637c(true);
            a0Var.f128519g = 8;
            a0Var.f128516d = (a0Var.f128516d & -5) | 32;
            a0Var.mo72639d(true);
            a0Var.f128516d = (((a0Var.f128516d & -65 & -129) | 256) & -8193) | 16384;
            a0Var.mo72636b(true);
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            a0Var.f128516d = a0Var.f128516d | 512 | 1024;
        }
        C47896n Kw = ((C79168k) C86312j.m106911c(C79168k.class)).mo74113Kw(recyclerView.getContext(), a0Var);
        relativeLayout.addView(Kw.getView(), 0);
        oVar.f173502D = Kw;
        Kw.mo72640f(new C47414a(this, oVar, relativeLayout));
        if (C87412m.m108589b(this.f127197f, "SCENE_DEFAULT")) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C16421b bVar = (C16421b) rVar.mo62443b(context).mo75002a(C16421b.class);
            if (bVar == null || !((Boolean) ((C36570n) bVar.f43834d).getValue()).booleanValue()) {
                z = false;
            }
            if (z) {
                Kw.getView().setOnTouchListener(new C47415b(oVar));
            }
        }
        ViewGroup.LayoutParams layoutParams = Kw.getView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).width = -1;
        C39818r rVar2 = C39818r.f106831a;
        Context context2 = oVar.f173499A;
        C87412m.m108593f(context2, "holder.context");
        ((HashSet) ((TextStatusCardFeedUIC) rVar2.mo62443b(context2).mo75002a(TextStatusCardFeedUIC.class)).f117020h).add(Kw);
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105918d("MicroMsg.TextStatus.CardFeedItemConvert", "onViewRecycled() called with: holder = " + oVar);
    }
}
