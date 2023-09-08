package wz0;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GotoCardHomePageEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: wz0.d */
public class C53248d {

    /* renamed from: wz0.d$a */
    public class C53249a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: wz0.d$b */
    public class C53250b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53258j f148590d;

        /* renamed from: e */
        public final /* synthetic */ String f148591e;

        public C53250b(C53258j jVar, String str) {
            this.f148590d = jVar;
            this.f148591e = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f148590d.mo23409b(this.f148591e);
        }
    }

    /* renamed from: wz0.d$c */
    public class C53251c implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: wz0.d$d */
    public class C53252d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53258j f148592d;

        public C53252d(C53258j jVar) {
            this.f148592d = jVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f148592d.mo63829a();
        }
    }

    /* renamed from: wz0.d$e */
    public class C53253e implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: wz0.d$f */
    public class C53254f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f148593d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f148594e;

        public C53254f(boolean z, MMActivity mMActivity) {
            this.f148593d = z;
            this.f148594e = mMActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f148593d) {
                this.f148594e.finish();
            }
        }
    }

    /* renamed from: wz0.d$g */
    public class C53255g implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: wz0.d$h */
    public class C53256h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f148595d;

        public C53256h(Context context) {
            this.f148595d = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            GotoCardHomePageEvent gotoCardHomePageEvent = new GotoCardHomePageEvent();
            gotoCardHomePageEvent.f107606d.f107608a = this.f148595d;
            gotoCardHomePageEvent.publish();
            Log.m105924i("MicroMsg.CardDialogHelper", "enter to cardhome");
        }
    }

    /* renamed from: wz0.d$i */
    public static class C53257i implements C53258j {
        /* renamed from: a */
        public void mo63829a() {
        }

        /* renamed from: b */
        public void mo23409b(String str) {
        }
    }

    /* renamed from: wz0.d$j */
    public interface C53258j {
        /* renamed from: a */
        void mo63829a();

        /* renamed from: b */
        void mo23409b(String str);
    }

    /* renamed from: a */
    public static void m59681a(MMActivity mMActivity, C53258j jVar) {
        C76879j.m92717K(mMActivity, true, mMActivity.getString(C0966R.string.aw_), "", mMActivity.getString(C0966R.string.a18), mMActivity.getString(C0966R.string.f7926wf), new C53252d(jVar), new C53253e());
    }

    /* renamed from: b */
    public static void m59682b(MMActivity mMActivity, String str, String str2, C53258j jVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = mMActivity.getString(C0966R.string.f7946x3);
        }
        C76879j.m92717K(mMActivity, true, str2, mMActivity.getString(C0966R.string.a3h), mMActivity.getString(C0966R.string.a18), mMActivity.getString(C0966R.string.f7926wf), new C53250b(jVar, str), new C53251c());
    }

    /* renamed from: c */
    public static void m59683c(MMActivity mMActivity, String str) {
        if (TextUtils.isEmpty(str)) {
            str = mMActivity.getString(C0966R.string.b2c);
        }
        m59685e(mMActivity, str, false);
    }

    /* renamed from: d */
    public static void m59684d(MMActivity mMActivity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "errcode = " + i;
        }
        m59685e(mMActivity, str, false);
    }

    /* renamed from: e */
    public static void m59685e(MMActivity mMActivity, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = mMActivity.getString(C0966R.string.b2c);
        }
        C76879j.m92713G(mMActivity, str, (String) null, false, new C53254f(z, mMActivity));
    }

    /* renamed from: f */
    public static void m59686f(Context context, int i, int i2, String str) {
        C77398g gVar;
        Context context2 = context;
        int i3 = i;
        int i4 = i2;
        if (i3 != -1) {
            if (i3 == C0966R.C0971layout.f6780ob) {
                String string = context.getResources().getString(i4);
                String string2 = context.getResources().getString(C0966R.string.ayp);
                C53255g gVar2 = new C53255g();
                View inflate = ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(i3, (ViewGroup) null);
                if (i3 == C0966R.C0971layout.f6779oa) {
                    ((TextView) inflate.findViewById(C0966R.C0970id.ax6)).setText(context.getResources().getString(C0966R.string.avy, new Object[]{TextUtils.isEmpty(str) ? context.getResources().getString(C0966R.string.awo) : str}));
                } else if (i3 == C0966R.C0971layout.f6778o_) {
                    ((TextView) inflate.findViewById(C0966R.C0970id.ax6)).setText(context.getResources().getString(C0966R.string.avx, new Object[]{TextUtils.isEmpty(str) ? context.getResources().getString(C0966R.string.awo) : str}));
                }
                gVar = C76879j.m92752w(context2, string, string2, inflate, gVar2);
            } else {
                String string3 = context.getResources().getString(i4);
                String string4 = context.getResources().getString(C0966R.string.az5);
                String string5 = context.getResources().getString(C0966R.string.ayp);
                C53256h hVar = new C53256h(context2);
                C53249a aVar = new C53249a();
                View inflate2 = ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(i3, (ViewGroup) null);
                if (i3 == C0966R.C0971layout.f6779oa) {
                    ((TextView) inflate2.findViewById(C0966R.C0970id.ax6)).setText(context.getResources().getString(C0966R.string.avy, new Object[]{TextUtils.isEmpty(str) ? context.getResources().getString(C0966R.string.awo) : str}));
                } else if (i3 == C0966R.C0971layout.f6778o_) {
                    ((TextView) inflate2.findViewById(C0966R.C0970id.ax6)).setText(context.getResources().getString(C0966R.string.avx, new Object[]{TextUtils.isEmpty(str) ? context.getResources().getString(C0966R.string.awo) : str}));
                }
                gVar = C76879j.m92747r(context, string3, inflate2, string4, string5, hVar, aVar);
            }
            if (gVar != null) {
                gVar.show();
            }
        }
    }
}
