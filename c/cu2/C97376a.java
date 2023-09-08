package cu2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsJankUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nl3.C47276a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import xu2.C102743c;
import z04.C112550d0;

/* renamed from: cu2.a */
public final class C97376a extends C47276a {

    /* renamed from: s */
    public final int f285869s;

    /* renamed from: t */
    public final long f285870t;

    /* renamed from: u */
    public final ArrayList<C102743c> f285871u = new ArrayList<>();

    /* renamed from: v */
    public final C13601g f285872v;

    /* renamed from: w */
    public final C13601g f285873w;

    /* renamed from: x */
    public final C13601g f285874x;

    /* renamed from: cu2.a$e */
    public static final class C7132e implements View.OnLongClickListener {

        /* renamed from: d */
        public static final C7132e f25106d = new C7132e();

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/debug/ImproveJankDialog$onCreate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$onCreate$3");
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            ClipboardHelper.setText(((TextView) view).getText());
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$onCreate$3");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/debug/ImproveJankDialog$onCreate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: cu2.a$a */
    public static final class C97377a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C97376a f285875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97377a(C97376a aVar) {
            super(0);
            this.f285875d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankFrameText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankFrameText$2");
            View findViewById = this.f285875d.findViewById(C0966R.C0970id.of9);
            C87412m.m108591d(findViewById);
            TextView textView = (TextView) findViewById;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankFrameText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankFrameText$2");
            return textView;
        }
    }

    /* renamed from: cu2.a$b */
    public static final class C97378b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C97376a f285876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97378b(C97376a aVar) {
            super(0);
            this.f285876d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankInfoText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankInfoText$2");
            View findViewById = this.f285876d.findViewById(C0966R.C0970id.of_);
            C87412m.m108591d(findViewById);
            TextView textView = (TextView) findViewById;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankInfoText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankInfoText$2");
            return textView;
        }
    }

    /* renamed from: cu2.a$c */
    public static final class C97379c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C97376a f285877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97379c(C97376a aVar) {
            super(0);
            this.f285877d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankNoNotice$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankNoNotice$2");
            View findViewById = this.f285877d.findViewById(C0966R.C0970id.ofa);
            C87412m.m108591d(findViewById);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankNoNotice$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$jankNoNotice$2");
            return findViewById;
        }
    }

    /* renamed from: cu2.a$d */
    public static final class C97380d implements View.OnClickListener {

        /* renamed from: d */
        public static final C97380d f285878d = new C97380d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/debug/ImproveJankDialog$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$onCreate$1");
            int i = ImproveSnsJankUI.f279577r;
            SnsMethodCalculate.markStartTimeMs("setShowJankInfo", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$Companion");
            SnsMethodCalculate.markStartTimeMs("access$setShowJankInfo$cp", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            ImproveSnsJankUI.f279578s = false;
            SnsMethodCalculate.markEndTimeMs("access$setShowJankInfo$cp", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            SnsMethodCalculate.markEndTimeMs("setShowJankInfo", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$Companion");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog$onCreate$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/debug/ImproveJankDialog$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97376a(ArrayList<C102743c> arrayList, Context context, int i, long j) {
        super(context);
        C87412m.m108594g(arrayList, FirebaseAnalytics.C113379b.METHOD);
        C87412m.m108594g(context, "context");
        this.f285869s = i;
        this.f285870t = j;
        int min = Math.min(5, arrayList.size());
        for (int i2 = 0; i2 < min; i2++) {
            this.f285871u.add(arrayList.get(i2));
        }
        this.f285872v = C36568h.m40985a(new C97378b(this));
        this.f285873w = C36568h.m40985a(new C97377a(this));
        this.f285874x = C36568h.m40985a(new C97379c(this));
    }

    /* renamed from: G */
    public View mo6265G() {
        SnsMethodCalculate.markStartTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d9h, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…t.dialog_jank_info, null)");
        SnsMethodCalculate.markEndTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        return inflate;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("getJankNoNotice", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        SnsMethodCalculate.markEndTimeMs("getJankNoNotice", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        ((View) ((C36570n) this.f285874x).getValue()).setOnClickListener(C97380d.f285878d);
        SnsMethodCalculate.markStartTimeMs("getJankFrameText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        SnsMethodCalculate.markEndTimeMs("getJankFrameText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        ((TextView) ((C36570n) this.f285873w).getValue()).setText("卡顿帧序号:" + this.f285869s + " 耗时: " + this.f285870t + " ms");
        Iterator<C102743c> it = this.f285871u.iterator();
        int i = 0;
        while (it.hasNext()) {
            C102743c next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C102743c cVar = next;
                StringBuilder sb = new StringBuilder();
                for (int size = cVar.mo142526b().size() - 1; -1 < size; size += -1) {
                    String str = cVar.mo142526b().get(size);
                    C87412m.m108593f(str, "struct.trace[index]");
                    sb.append('|' + ((String) C110818d0.m150914L(C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null))) + "|->");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("top-" + i + 10);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("name:");
                SnsMethodCalculate.markStartTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                String str2 = cVar.f303375b;
                SnsMethodCalculate.markEndTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                sb5.append(str2);
                sb5.append('#');
                SnsMethodCalculate.markStartTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                String str3 = cVar.f303374a;
                SnsMethodCalculate.markEndTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                sb5.append(str3);
                sb5.append(10);
                sb4.append(sb5.toString());
                sb4.append("cost:" + ((int) cVar.mo142525a()) + 10);
                sb4.append("trace:" + sb + 10);
                sb4.append("\n");
                SnsMethodCalculate.markStartTimeMs("getJankInfoText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
                SnsMethodCalculate.markEndTimeMs("getJankInfoText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
                ((TextView) ((C36570n) this.f285872v).getValue()).append(sb4);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        SnsMethodCalculate.markStartTimeMs("getJankInfoText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        SnsMethodCalculate.markEndTimeMs("getJankInfoText", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
        ((TextView) ((C36570n) this.f285872v).getValue()).setOnLongClickListener(C7132e.f25106d);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.debug.ImproveJankDialog");
    }
}
