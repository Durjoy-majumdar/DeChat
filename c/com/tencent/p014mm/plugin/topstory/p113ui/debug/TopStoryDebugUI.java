package com.tencent.p014mm.plugin.topstory.p113ui.debug;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Process;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.vfs.C86013q1;
import e83.C45556b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI */
public class TopStoryDebugUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI$a */
    public class C43248a extends C44701a2 {
        public C43248a() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            TopStoryDebugUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI$b */
    public class C43249b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45556b f117040d;

        public C43249b(TopStoryDebugUI topStoryDebugUI, C45556b bVar) {
            this.f117040d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86013q1.m106445f(this.f117040d.mo71077o());
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$2", "onClick", "(Landroid/view/View;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$2", "onClick", "(Landroid/view/View;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI$c */
    public class C43250c implements View.OnClickListener {
        public C43250c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                String N = C86013q1.m106432N(C112760b.m154195C() + "topstory/trace.info");
                TopStoryDebugUI topStoryDebugUI = TopStoryDebugUI.this;
                TopStoryDebugUI.m46811H7(topStoryDebugUI, topStoryDebugUI, N);
            } catch (Exception unused) {
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/debug/TopStoryDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m46811H7(TopStoryDebugUI topStoryDebugUI, Context context, String str) {
        topStoryDebugUI.getClass();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
        textView.setTypeface(Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c_z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.k3v);
        setBackBtn(new C43248a());
        C45556b g = C43471q.m46983g(1);
        ((TextView) findViewById(C0966R.C0970id.l4_)).setText(getString(C0966R.string.k3t, new Object[]{String.valueOf(g.mo71078p0())}));
        findViewById(C0966R.C0970id.bdk).setOnClickListener(new C43249b(this, g));
        findViewById(C0966R.C0970id.i2n).setOnClickListener(new C43250c());
    }
}
