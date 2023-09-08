package jg1;

import ak1.C54067f0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fg1.C8022a;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: jg1.a */
public final class C9400a {

    /* renamed from: a */
    public final Context f29338a;

    /* renamed from: b */
    public final View f29339b;

    /* renamed from: c */
    public final TextView f29340c;

    /* renamed from: d */
    public final TextView f29341d;

    /* renamed from: e */
    public final C8022a f29342e;

    /* renamed from: f */
    public String f29343f = "";

    /* renamed from: jg1.a$a */
    public static final class C9401a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Button f29344d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f29345e;

        /* renamed from: f */
        public final /* synthetic */ C9400a f29346f;

        public C9401a(Button button, C32224a<C13598b0> aVar, C9400a aVar2) {
            this.f29344d = button;
            this.f29345e = aVar;
            this.f29346f = aVar2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C87412m.m108589b(this.f29344d.getText(), this.f29344d.getContext().getString(C0966R.string.m3s))) {
                C54067f0.C0064m mVar = C54067f0.C0064m.GROUP_CHAT_BUTTON;
                Log.m105924i("FinderLiveBoxReportUtils", "boxClickReport elementId: group_chat_button");
                C7335d c = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, mVar, (Map) null, (String) null, 6, (Object) null);
                this.f29345e.invoke();
                this.f29346f.f29342e.f26706b.mo5085n();
            } else {
                this.f29346f.f29342e.f26706b.mo5085n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9400a(Context context, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "block");
        this.f29338a = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.coi, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ala_content_layout, null)");
        this.f29339b = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.mfq);
        C87412m.m108593f(findViewById, "customView.findViewById(R.id.main_text)");
        this.f29340c = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.mbe);
        Button button = (Button) findViewById2;
        button.setOnClickListener(new C9401a(button, aVar, this));
        C87412m.m108593f(findViewById2, "customView.findViewById<…}\n            }\n        }");
        this.f29341d = (TextView) findViewById2;
        C8022a aVar2 = new C8022a(context, true);
        aVar2.f26709e.addView(inflate);
        this.f29342e = aVar2;
    }
}
