package yz1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import f40.C86709a0;
import j20.C117292a;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;

/* renamed from: yz1.f */
public class C79188f {

    /* renamed from: a */
    public C104428a f232492a;

    /* renamed from: b */
    public View f232493b;

    /* renamed from: c */
    public Context f232494c;

    /* renamed from: d */
    public int f232495d;

    /* renamed from: e */
    public BottomSheetBehavior f232496e;

    /* renamed from: f */
    public TextView f232497f = ((TextView) this.f232493b.findViewById(C0966R.C0970id.f358920hv1));

    /* renamed from: g */
    public C79189a f232498g;

    /* renamed from: h */
    public String f232499h;

    /* renamed from: yz1.f$a */
    public interface C79189a {
    }

    public C79188f(Context context) {
        this.f232494c = context;
        this.f232493b = View.inflate(context, C0966R.C0971layout.ayo, (ViewGroup) null);
        C104428a aVar = new C104428a(this.f232494c, 0);
        this.f232492a = aVar;
        aVar.setContentView(this.f232493b);
        this.f232492a.setOnDismissListener(new C79185c(this));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f232493b.getLayoutParams();
        layoutParams.height = C76577a.m92151b(this.f232494c, 250);
        this.f232493b.setLayoutParams(layoutParams);
        this.f232495d = C76577a.m92151b(this.f232494c, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f232493b.getParent());
        this.f232496e = y;
        if (y != null) {
            y.mo146383A(this.f232495d);
            this.f232496e.f309230p = false;
        }
        ((Button) this.f232493b.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C79186d(this));
        ((Button) this.f232493b.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C79187e(this));
    }

    /* renamed from: a */
    public void mo109202a() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        Log.m105918d("MicroMsg.TiemDatePicker", "mobile :" + str);
        if (str == null || str.length() <= 0) {
            Context context = this.f232494c;
            C76879j.m92718L(context, false, context.getString(C0966R.string.ff5), this.f232494c.getString(C0966R.string.ff5), this.f232494c.getString(C0966R.string.ff7), this.f232494c.getString(C0966R.string.f7926wf), new C79183a(this), new C79184b(this), C0966R.color.f3536x0, C0966R.color.f3536x0);
            return;
        }
        this.f232499h = str;
        this.f232497f.setText(str);
        C104428a aVar = this.f232492a;
        if (aVar != null) {
            aVar.show();
        }
    }

    /* renamed from: b */
    public void mo109203b(Context context, Intent intent) {
        String str;
        Log.m105924i("MicroMsg.TiemDatePicker", "startWizardActivity()");
        Assert.assertTrue("startWizardActivity: Param context should be a Activity :" + context.toString(), context instanceof Activity);
        Activity activity = (Activity) context;
        Intent intent2 = activity.getIntent();
        String str2 = null;
        if (intent2 != null) {
            str2 = intent2.getStringExtra("WizardRootClass");
            str = intent2.getStringExtra("WizardTransactionId");
        } else {
            str = null;
        }
        intent.putExtra("WizardRootClass", str2);
        if (str != null) {
            intent.putExtra("WizardTransactionId", str);
        }
        C9556a aVar = new C9556a();
        C60958c.m71442b(4098, aVar);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker", "startBindActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
