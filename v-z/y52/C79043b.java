package y52;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import gy3.C87412m;
import java.util.List;
import kd0.C76552z;
import nj3.C76879j;
import nj3.C76901s0;
import nj3.C76912y0;
import ob0.C77002r;
import p182kk.C61104a;
import p375qh.C77340l;
import p910lj.C76701a;
import qo3.C89779i0;
import w52.C78517d;
import w52.C78519i;
import wi3.C78603a;

/* renamed from: y52.b */
public class C79043b implements C72825s0 {

    /* renamed from: a */
    public MassSendMsgUI f232124a;

    /* renamed from: b */
    public ChatFooter f232125b;

    /* renamed from: c */
    public C79049f f232126c;

    /* renamed from: d */
    public long f232127d = -1;

    /* renamed from: e */
    public Toast f232128e;

    /* renamed from: f */
    public Vibrator f232129f;

    /* renamed from: g */
    public C89779i0 f232130g = null;

    /* renamed from: h */
    public String f232131h;

    /* renamed from: i */
    public List<String> f232132i;

    /* renamed from: j */
    public boolean f232133j;

    /* renamed from: k */
    public final MTimerHandler f232134k = new MTimerHandler(new C79044a(), true);

    /* renamed from: l */
    public final C77002r.C77003a f232135l;

    /* renamed from: m */
    public final C77002r.C77004b f232136m;

    /* renamed from: n */
    public final MTimerHandler f232137n;

    /* renamed from: y52.b$a */
    public class C79044a implements MTimerHandler.CallBack {
        public C79044a() {
        }

        public boolean onTimerExpired() {
            C79043b bVar = C79043b.this;
            bVar.f232125b.mo100399f1(bVar.f232126c.mo107319d());
            return true;
        }
    }

    /* renamed from: y52.b$b */
    public class C79045b implements C77002r.C77003a {
        public C79045b() {
        }

        /* renamed from: a */
        public void mo95814a() {
            C79043b.this.f232126c.reset();
            C79043b.this.f232134k.stopTimer();
            C79043b.this.f232137n.stopTimer();
            MMEntryLock.unlock("keep_app_silent");
            C79043b.this.f232125b.mo100344C0(ChatFooter$$o1.Error);
            Log.m105926v("MicroMsg.MassSendFooterEventImpl", "record stop on error");
            MassSendMsgUI massSendMsgUI = C79043b.this.f232124a;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.bat), 0).show();
        }
    }

    /* renamed from: y52.b$c */
    public class C79046c implements C77002r.C77004b {
        public C79046c() {
        }

        /* renamed from: a */
        public void mo102901a() {
            C79043b.this.f232125b.mo100362L0();
        }
    }

    /* renamed from: y52.b$d */
    public class C79047d implements MTimerHandler.CallBack {
        public C79047d() {
        }

        public boolean onTimerExpired() {
            C79043b bVar = C79043b.this;
            if (bVar.f232127d == -1) {
                bVar.f232127d = Util.currentTicks();
            }
            long ticksToNow = Util.ticksToNow(C79043b.this.f232127d);
            boolean z = true;
            if (ticksToNow >= 50000 && ticksToNow <= 60000) {
                C79043b bVar2 = C79043b.this;
                Toast toast = bVar2.f232128e;
                if (toast == null) {
                    int i = (int) ((60000 - ticksToNow) / 1000);
                    MassSendMsgUI massSendMsgUI = bVar2.f232124a;
                    bVar2.f232128e = C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getResources().getQuantityString(C0966R.plurals.f7222c, i, new Object[]{Integer.valueOf(i)}), 0);
                } else {
                    int i2 = (int) ((60000 - ticksToNow) / 1000);
                    toast.setText(bVar2.f232124a.getResources().getQuantityString(C0966R.plurals.f7222c, i2, new Object[]{Integer.valueOf(i2)}));
                }
                C79043b.this.f232128e.show();
            }
            if (ticksToNow < 60000) {
                return true;
            }
            Log.m105926v("MicroMsg.MassSendFooterEventImpl", "record stop on countdown");
            C76901s0 s0Var = C79043b.this.f232125b.f211782L2;
            if (s0Var == null || !s0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C79043b.this.f232125b.mo100342B0();
            } else {
                if (C79043b.this.f232126c.stop()) {
                    C79043b.this.mo108994c();
                }
                C79043b.this.f232125b.mo100344C0(ChatFooter$$o1.SendVoice);
            }
            PlaySound.play(C79043b.this.f232124a, C0966R.string.k2r);
            return false;
        }
    }

    /* renamed from: y52.b$e */
    public class C79048e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C78519i f232142d;

        public C79048e(C78519i iVar) {
            this.f232142d = iVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f232142d);
            C89779i0 i0Var = C79043b.this.f232130g;
            if (i0Var != null) {
                i0Var.dismiss();
                C79043b.this.f232130g = null;
            }
        }
    }

    /* renamed from: y52.b$f */
    public class C79049f extends C77340l {

        /* renamed from: u */
        public String f232144u;

        public C79049f(C79043b bVar, Context context) {
            super(context, false);
        }

        /* renamed from: a */
        public String mo107315a() {
            return this.f232144u;
        }

        public boolean stop() {
            this.f232144u = this.f225499e;
            boolean stop = super.stop();
            reset();
            return stop;
        }
    }

    public C79043b(MassSendMsgUI massSendMsgUI, ChatFooter chatFooter, String str, List<String> list, boolean z) {
        C79045b bVar = new C79045b();
        this.f232135l = bVar;
        C79046c cVar = new C79046c();
        this.f232136m = cVar;
        this.f232137n = new MTimerHandler(new C79047d(), true);
        this.f232124a = massSendMsgUI;
        this.f232125b = chatFooter;
        this.f232131h = str;
        this.f232132i = list;
        this.f232133j = z;
        C79049f fVar = new C79049f(this, massSendMsgUI);
        this.f232126c = fVar;
        fVar.f225510p = bVar;
        fVar.f225509o = cVar;
        this.f232129f = (Vibrator) massSendMsgUI.getSystemService("vibrator");
    }

    /* renamed from: A */
    public boolean mo100646A() {
        this.f232134k.stopTimer();
        this.f232137n.stopTimer();
        this.f232127d = -1;
        this.f232125b.mo100344C0(ChatFooter$$o1.Cancel);
        C79049f fVar = this.f232126c;
        fVar.stop();
        C76552z.m92069g(fVar.f232144u);
        ((C92614a) C97625j3.m125813c()).mo126635b();
        return false;
    }

    /* renamed from: B */
    public boolean mo100647B() {
        this.f232134k.stopTimer();
        this.f232137n.stopTimer();
        this.f232127d = -1;
        this.f232126c.stop();
        this.f232125b.mo100344C0(ChatFooter$$o1.StopRecord);
        ((C92614a) C97625j3.m125813c()).mo126635b();
        return true;
    }

    /* renamed from: C */
    public boolean mo100648C() {
        this.f232134k.stopTimer();
        this.f232137n.stopTimer();
        this.f232127d = -1;
        if (this.f232126c.stop()) {
            C71562c cVar = C71562c.f207365v;
            C71562c.f207365v.mo98691b(0);
            mo108994c();
            this.f232125b.mo100344C0(ChatFooter$$o1.SendVoice);
        } else {
            this.f232125b.mo100356I0();
        }
        ((C92614a) C97625j3.m125813c()).mo126635b();
        return false;
    }

    /* renamed from: D */
    public void mo100649D(boolean z) {
    }

    /* renamed from: E */
    public void mo100650E() {
    }

    /* renamed from: F */
    public boolean mo100651F(String str, int i) {
        mo108994c();
        return true;
    }

    /* renamed from: a */
    public String mo100652a() {
        C79049f fVar = this.f232126c;
        return fVar != null ? fVar.f232144u : "";
    }

    /* renamed from: b */
    public long mo100653b() {
        C79049f fVar = this.f232126c;
        if (fVar != null) {
            return fVar.mo107316b();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo108994c() {
        C78517d dVar = new C78517d();
        dVar.f229981g = this.f232131h;
        dVar.f229982h = this.f232132i.size();
        C79049f fVar = this.f232126c;
        dVar.f229979e = fVar.f232144u;
        dVar.f229983i = 34;
        dVar.f229984j = fVar.f225504j;
        C78519i iVar = new C78519i(dVar, this.f232133j, 0);
        C97625j3.m125815e().mo123460f(iVar);
        MassSendMsgUI massSendMsgUI = this.f232124a;
        this.f232130g = C76879j.m92723Q(massSendMsgUI, massSendMsgUI.getString(C0966R.string.a3h), this.f232124a.getString(C0966R.string.ilx), true, true, new C79048e(iVar));
    }

    public void onPause() {
        this.f232134k.stopTimer();
        this.f232137n.stopTimer();
        this.f232127d = -1;
        boolean z = true;
        if (!(C78603a.f230232b && C87412m.m108589b(C78603a.f230231a, this.f232126c.f232144u))) {
            String str = this.f232126c.f232144u;
            if (!C78603a.f230234d || !C87412m.m108589b(C78603a.f230233c, str)) {
                z = false;
            }
            if (!z) {
                this.f232126c.stop();
            }
        }
        ((C92614a) C97625j3.m125813c()).mo126635b();
    }

    public void onResume() {
    }

    public void release() {
    }

    /* renamed from: s */
    public void mo100657s(String str) {
    }

    /* renamed from: t */
    public boolean mo100658t(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        this.f232124a.getClass();
        MassSendMsgUI.f201430r = str;
        C78517d dVar = new C78517d();
        dVar.f229981g = this.f232131h;
        dVar.f229982h = this.f232132i.size();
        dVar.f229979e = str;
        dVar.f229983i = 1;
        C78519i iVar = new C78519i(dVar, this.f232133j, 0);
        C97625j3.m125815e().mo123460f(iVar);
        MassSendMsgUI massSendMsgUI = this.f232124a;
        this.f232130g = C76879j.m92723Q(massSendMsgUI, massSendMsgUI.getString(C0966R.string.a3h), this.f232124a.getString(C0966R.string.ilx), true, true, new C79050c(this, iVar));
        return true;
    }

    /* renamed from: u */
    public void mo100659u(View view, MotionEvent motionEvent) {
    }

    /* renamed from: v */
    public boolean mo100660v(String str) {
        return C76552z.m92069g(str);
    }

    /* renamed from: w */
    public boolean mo100661w() {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f232124a, (View) null);
            return false;
        } else if (C61104a.m71663s(this.f232124a, (DialogInterface.OnClickListener) null)) {
            return false;
        } else {
            this.f232129f.vibrate(50);
            C71562c cVar = C71562c.f207365v;
            C71562c.f207365v.f207366a = true;
            this.f232134k.startTimer(100);
            this.f232137n.startTimer(200);
            DisplayMetrics displayMetrics = this.f232124a.getResources().getDisplayMetrics();
            ChatFooter chatFooter = this.f232125b;
            chatFooter.mo100371Q0(displayMetrics.heightPixels - chatFooter.getHeight());
            this.f232126c.mo107322g("_USER_FOR_THROWBOTTLE_");
            C79049f fVar = this.f232126c;
            fVar.f225509o = this.f232136m;
            fVar.f225510p = this.f232135l;
            ((C92614a) C97625j3.m125813c()).mo126634a();
            return false;
        }
    }

    /* renamed from: x */
    public void mo100662x() {
        this.f232125b.mo100344C0(ChatFooter$$o1.Cancel);
        C79049f fVar = this.f232126c;
        fVar.stop();
        C76552z.m92069g(fVar.f232144u);
    }

    /* renamed from: y */
    public void mo100663y(View view) {
    }

    /* renamed from: z */
    public void mo100664z(View view) {
    }
}
