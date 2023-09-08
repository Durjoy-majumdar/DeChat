package fy1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.luggage.ipc.AddShortcutTask;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76874e0;
import nj3.C76879j;
import org.json.JSONObject;
import p828wa.C53099d;
import p910lj.C76701a;
import te3.C50187kw2;

/* renamed from: fy1.g */
public class C45851g extends C45845a {

    /* renamed from: fy1.g$a */
    public class C45852a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AddShortcutTask f123797d;

        /* renamed from: e */
        public final /* synthetic */ C43658n f123798e;

        /* renamed from: f */
        public final /* synthetic */ Context f123799f;

        /* renamed from: fy1.g$a$a */
        public class C45853a extends C53099d {
            public C45853a() {
            }

            /* renamed from: a */
            public JSONObject mo14701a() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("success", C45852a.this.f123797d.f112905h);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            /* renamed from: b */
            public String mo14702b() {
                return "onAddShortcutStatus";
            }
        }

        /* renamed from: fy1.g$a$b */
        public class C45854b implements DialogInterface.OnClickListener {
            public C45854b(C45852a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public C45852a(C45851g gVar, AddShortcutTask addShortcutTask, C43658n nVar, Context context) {
            this.f123797d = addShortcutTask;
            this.f123798e = nVar;
            this.f123799f = context;
        }

        public void run() {
            this.f123797d.mo114397h();
            this.f123798e.f148259i.mo73815b(new C45853a());
            if (this.f123797d.f112905h) {
                C76879j.m92744o(this.f123799f, C0966R.string.llb, C0966R.string.a3h, false, new C45854b(this));
                return;
            }
            Context context = this.f123799f;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lla), 0).show();
        }
    }

    public C45851g(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo71306a(Context context, C43658n nVar, C76874e0 e0Var, C50187kw2 kw22) {
        String b = nVar.f117923M.mo67920b();
        String string = nVar.f148261n.getString("shortcut_user_name");
        if (!nVar.f148261n.getBoolean("from_shortcut", false) && !Util.isNullOrNil(b) && !Util.isNullOrNil(string)) {
            e0Var.mo107142f(kw22.f137072g, kw22.f137070e + "__" + kw22.f137071f);
        }
    }

    /* renamed from: b */
    public void mo71307b(Context context, C43658n nVar, C50187kw2 kw22) {
        String string = nVar.f148261n.getString("shortcut_user_name");
        String b = nVar.f117923M.mo67920b();
        if (!Util.isNullOrNil(string) && !Util.isNullOrNil(b)) {
            AddShortcutTask addShortcutTask = new AddShortcutTask();
            addShortcutTask.f112903f = string;
            addShortcutTask.f112904g = b;
            addShortcutTask.f112906i = new C45852a(this, addShortcutTask, nVar, context);
            addShortcutTask.mo114395c();
        }
    }
}
