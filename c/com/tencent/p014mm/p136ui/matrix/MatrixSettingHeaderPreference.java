package com.tencent.p014mm.p136ui.matrix;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ce2.C28544a;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ee2.C86511b;
import fe2.C86863b;
import gm3.b$$a;
import gm3.b$$b;
import gm3.b$$c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Locale;
import nj3.C76879j;
import org.xwalk.core.XWalkEnvironment;
import p1195ge.C116947b;
import p761yd.C91441c;
import p910lj.C76701a;
import p933be.C79691a;
import p995kf.C88146a;
import qe3.C89625d;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference */
public class MatrixSettingHeaderPreference extends Preference {

    /* renamed from: J */
    public C85919c f250261J;

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference$a */
    public class C85917a implements View.OnLongClickListener {

        /* renamed from: d */
        public int f250262d = 3;

        /* renamed from: e */
        public Toast f250263e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f250264f;

        public C85917a(ImageView imageView) {
            this.f250264f = imageView;
        }

        public boolean onLongClick(View view) {
            C85919c cVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            MatrixSettingHeaderPreference matrixSettingHeaderPreference = MatrixSettingHeaderPreference.this;
            if (matrixSettingHeaderPreference.f250261J == null) {
                C117292a.m165362h(true, this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            this.f250262d--;
            if (this.f250263e == null) {
                Context context = matrixSettingHeaderPreference.f121274d;
                this.f250263e = C76701a.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.gpu, new Object[]{Integer.valueOf(this.f250262d)}), 1);
            }
            if (this.f250262d <= 0) {
                this.f250263e.setText(MatrixSettingHeaderPreference.this.f121274d.getResources().getString(C0966R.string.gpt));
            } else {
                this.f250263e.setText(MatrixSettingHeaderPreference.this.f121274d.getResources().getString(C0966R.string.gpu, new Object[]{Integer.valueOf(this.f250262d)}));
            }
            ObjectAnimator.ofPropertyValuesHolder(this.f250264f, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.9f), Keyframe.ofFloat(0.2f, 0.9f), Keyframe.ofFloat(0.3f, 1.1f), Keyframe.ofFloat(0.4f, 1.1f), Keyframe.ofFloat(0.5f, 1.1f), Keyframe.ofFloat(0.6f, 1.1f), Keyframe.ofFloat(0.7f, 1.1f), Keyframe.ofFloat(0.8f, 1.1f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f)}), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.9f), Keyframe.ofFloat(0.2f, 0.9f), Keyframe.ofFloat(0.3f, 1.1f), Keyframe.ofFloat(0.4f, 1.1f), Keyframe.ofFloat(0.5f, 1.1f), Keyframe.ofFloat(0.6f, 1.1f), Keyframe.ofFloat(0.7f, 1.1f), Keyframe.ofFloat(0.8f, 1.1f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f)}), PropertyValuesHolder.ofKeyframe(View.ROTATION, new Keyframe[]{Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -3.0f), Keyframe.ofFloat(0.2f, -3.0f), Keyframe.ofFloat(0.3f, 3.0f), Keyframe.ofFloat(0.4f, -3.0f), Keyframe.ofFloat(0.5f, 3.0f), Keyframe.ofFloat(0.6f, -3.0f), Keyframe.ofFloat(0.7f, 3.0f), Keyframe.ofFloat(0.8f, -3.0f), Keyframe.ofFloat(0.9f, 3.0f), Keyframe.ofFloat(1.0f, 0.0f)})}).setDuration(1000).start();
            this.f250263e.show();
            if (this.f250262d == 0 && (cVar = MatrixSettingHeaderPreference.this.f250261J) != null) {
                MatrixSettingUI matrixSettingUI = (MatrixSettingUI) cVar;
                matrixSettingUI.getClass();
                Log.m105924i("Matrix.SettingUI", "onOpenDev...");
                MatrixSettingUI.f250268g = true;
                matrixSettingUI.getPreferenceScreen().mo72529n("matrix_dev_wording", false);
                matrixSettingUI.getPreferenceScreen().mo72529n("make_leak_preference", false);
                matrixSettingUI.getPreferenceScreen().mo72529n("methodBeat_preference", false);
                matrixSettingUI.getPreferenceScreen().mo72529n("trace_dev_log_preference", false);
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                aVar.getClass();
                ((CheckBoxPreference) matrixSettingUI.getPreferenceScreen().mo72519a("methodBeat_preference")).mo6805K(AppMethodBeat.getInstance().isAlive());
                ((CheckBoxPreference) matrixSettingUI.getPreferenceScreen().mo72519a("trace_dev_log_preference")).mo6805K(aVar.f254915h.f255604i);
                matrixSettingUI.getPreferenceScreen().notifyDataSetChanged();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference$b */
    public class C85918b implements View.OnClickListener {

        /* renamed from: d */
        public long f250266d = 0;

        public C85918b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long nowMilliSecond = Util.nowMilliSecond();
            long j = this.f250266d;
            if (j > nowMilliSecond || nowMilliSecond - j > 300) {
                this.f250266d = nowMilliSecond;
                C117292a.m165361g(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f250266d = nowMilliSecond;
            Context context = view.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("[ver  ] ");
            int i = 0;
            sb.append(String.format(Locale.ENGLISH, "%s %08X", new Object[]{ChannelUtil.formatVersion(context, C89625d.f257841g, true), Integer.valueOf(C89625d.f257841g)}));
            sb.append("\n");
            Object[] objArr = new Object[1];
            objArr[0] = BuildInfo.IS_ARM64 ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR;
            sb.append(String.format("[eabi ] %s\n", objArr));
            C28544a aVar = C28544a.INSTANCE;
            C85311d dVar = (C85311d) aVar.mo56045a(C86511b.class);
            if (dVar != null && dVar.mo118533g().mo118547e()) {
                i = 1;
            }
            C85311d dVar2 = (C85311d) aVar.mo56045a(C86863b.class);
            if (dVar2 != null && dVar2.mo118533g().mo118547e()) {
                i |= 2;
            }
            sb.append("[diag ] ");
            sb.append(i);
            sb.append("\n");
            C79691a.m96805b(C114451e.class, new b$$a(this, sb));
            C79691a.m96805b(C114536x.class, new b$$b(sb));
            C79691a.m96805b(C116947b.class, new b$$c(sb));
            TextView textView = new TextView(context);
            textView.setText(sb);
            textView.setGravity(19);
            textView.setTextSize(1, 10.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            textView.setTextColor(MatrixSettingHeaderPreference.this.f121274d.getResources().getColor(C0966R.color.FG_0));
            textView.setTypeface(Typeface.MONOSPACE);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            textView.setVerticalScrollBarEnabled(true);
            textView.setVerticalFadingEdgeEnabled(true);
            C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference$c */
    public interface C85919c {
    }

    public MatrixSettingHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((TextView) view.findViewById(C0966R.C0970id.gpo)).setText(BuildInfo.MATRIX_VERSION);
        view.setOnLongClickListener(new C85917a((ImageView) view.findViewById(C0966R.C0970id.gpn)));
        view.setOnClickListener(new C85918b());
    }

    public MatrixSettingHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatrixSettingHeaderPreference(Context context) {
        super(context);
    }
}
