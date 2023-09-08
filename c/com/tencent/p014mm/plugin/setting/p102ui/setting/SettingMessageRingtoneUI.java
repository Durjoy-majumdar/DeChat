package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.graphics.Paint;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C71169z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.Future;
import jq3.C33630h;
import jq3.C76437p;
import kotlin.Metadata;
import nj3.C76912y0;
import nj3.C88989a;
import p385u2.C111105a;
import p523fp.C32147e;
import p645pj.C77091b;
import p645pj.C77094g;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zc2.C119090b;
import zc2.C119093f;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingMessageRingtoneUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/setting/ui/setting/z$a;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(1)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI */
public class SettingMessageRingtoneUI extends MMActivity implements C71169z.C71170a {

    /* renamed from: d */
    public Future<?> f205635d;

    /* renamed from: e */
    public SoundPool f205636e;

    /* renamed from: f */
    public final ArrayList<C77094g> f205637f = new ArrayList<>();

    /* renamed from: g */
    public final C13601g f205638g = C36568h.m40985a(new C71054g(this));

    /* renamed from: h */
    public C89779i0 f205639h;

    /* renamed from: i */
    public Integer f205640i;

    /* renamed from: j */
    public Integer f205641j;

    /* renamed from: n */
    public Integer f205642n;

    /* renamed from: o */
    public final SettingMessageRingtoneUI$ringtoneResUpdateListener$1 f205643o = new SettingMessageRingtoneUI$ringtoneResUpdateListener$1(this, C40008f.f107254d);

    /* renamed from: p */
    public Ringtone f205644p;

    /* renamed from: q */
    public C77094g f205645q;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$a */
    public static final class C71048a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ SettingMessageRingtoneUI f205646a;

        public C71048a(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            this.f205646a = settingMessageRingtoneUI;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                SettingMessageRingtoneUI.m83519H7(this.f205646a);
            } else {
                this.f205646a.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$b */
    public static final class C71049b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingMessageRingtoneUI f205647d;

        public C71049b(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            this.f205647d = settingMessageRingtoneUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205647d.mo97706I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$c */
    public static final class C71050c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingMessageRingtoneUI f205648d;

        public C71050c(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            this.f205648d = settingMessageRingtoneUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            SettingMessageRingtoneUI.m83519H7(this.f205648d);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$d */
    public static final class C71051d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ SettingMessageRingtoneUI f205649d;

        public C71051d(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            this.f205649d = settingMessageRingtoneUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f205649d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$e */
    public static final class C71052e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SettingMessageRingtoneUI f205650d;

        public C71052e(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            this.f205650d = settingMessageRingtoneUI;
        }

        public final void run() {
            C89779i0 i0Var = this.f205650d.f205639h;
            if (i0Var != null) {
                i0Var.cancel();
            }
            C76912y0.m92767f(MMApplicationContext.getContext(), this.f205650d.getString(C0966R.string.h7q));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$f */
    public static final class C71053f implements Runnable {

        /* renamed from: d */
        public static final C71053f f205651d = new C71053f();

        public final void run() {
            boolean z = true;
            String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(96, 1);
            boolean k = C86013q1.m106450k(AD);
            if (k) {
                C119093f.wx0(AD);
            } else {
                z = false;
            }
            Log.m105924i("MicroMsg.SettingMessageRingtoneUI", "handle cachefile, cacheExist:" + k + ", result:" + z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$g */
    public static final class C71054g extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ SettingMessageRingtoneUI f205652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71054g(SettingMessageRingtoneUI settingMessageRingtoneUI) {
            super(0);
            this.f205652d = settingMessageRingtoneUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f205652d.findViewById(C0966R.C0970id.iux);
        }
    }

    /* renamed from: H7 */
    public static final void m83519H7(SettingMessageRingtoneUI settingMessageRingtoneUI) {
        settingMessageRingtoneUI.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("finish ");
        C77094g gVar = settingMessageRingtoneUI.f205645q;
        sb.append(gVar != null ? Integer.valueOf(gVar.f225189a) : null);
        Log.m105924i("MicroMsg.SettingMessageRingtoneUI", sb.toString());
        C77094g gVar2 = settingMessageRingtoneUI.f205645q;
        if (gVar2 != null) {
            int i = gVar2.f225189a;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("setting_notification");
            if (mmkv != null) {
                mmkv.putInt("settings.ringtone.wechat", i);
            }
            C119090b.m167891a(C77091b.m93029k(gVar2.f225189a));
        }
        settingMessageRingtoneUI.finish();
    }

    /* renamed from: I7 */
    public final void mo97706I7() {
        if (!C87412m.m108589b(this.f205642n, this.f205641j)) {
            C77426q qVar = new C77426q(getContext());
            qVar.mo107595g(getString(C0966R.string.iny));
            qVar.mo107602n(getString(C0966R.string.f8035zx));
            qVar.mo107598j(getString(C0966R.string.f7926wf));
            qVar.mo107590b(new C71048a(this));
            qVar.mo107603o();
            return;
        }
        finish();
    }

    /* renamed from: J7 */
    public final RecyclerView mo97707J7() {
        Object value = ((C36570n) this.f205638g).getValue();
        C87412m.m108593f(value, "<get-ringtoneRv>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: Y0 */
    public boolean mo97708Y0(C77094g gVar) {
        C87412m.m108594g(gVar, "composition");
        Integer num = this.f205642n;
        return num != null && num.intValue() == gVar.f225189a;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxi;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ivz);
        setBackBtn(new C71049b(this));
        addTextOptionMenu(0, getContext().getString(C0966R.string.f8014z_), new C71050c(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(0, false);
        hideActionbarLine();
        mo97707J7().setAdapter(new C71166y(this.f205637f, this));
        WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.mo16974W(1);
        mo97707J7().setLayoutManager(wxLinearLayoutManager);
        RecyclerView J7 = mo97707J7();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C76437p.C46569a aVar = new C76437p.C46569a(context);
        aVar.f125465c = C33630h.NORMAL;
        aVar.f125469g[0] = C111105a.m151500b(aVar.f125463a, C0966R.color.a1c);
        aVar.f125470h = C111105a.m151500b(aVar.f125463a, C0966R.color.ahf);
        aVar.f125466d = aVar.f125464b.getDimensionPixelSize(C0966R.dimen.f3695bo);
        aVar.f125468f = aVar.f125464b.getDimensionPixelSize(C0966R.dimen.f3736cp);
        aVar.f125467e = aVar.f125464b.getDimensionPixelSize(C0966R.dimen.f3736cp);
        Paint paint = new Paint();
        paint.setColor(aVar.f125470h);
        J7.mo17085h0(new C76437p(aVar.f125465c, aVar.f125469g, paint, aVar.f125466d, aVar.f125467e, aVar.f125468f));
        Log.m105924i("MicroMsg.SettingMessageRingtoneUI", "current ringtone:" + C77091b.m93030l());
        if (!C86013q1.m106450k(C77091b.m93029k(1))) {
            Log.m105920e("MicroMsg.SettingMessageRingtoneUI", "file no exits");
            this.f205643o.alive();
            ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(96);
            this.f205639h = C89779i0.m112248e(getContext(), getContext().getString(C0966R.string.gat), true, 3, new C71051d(this));
            C119179t tVar = C119157j.f356862d;
            C71052e eVar = new C71052e(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f205635d = jVar.mo183892w(eVar, 15000, false);
            ((C119157j) C119157j.f356862d).mo183875f(C71053f.f205651d);
        }
    }

    public void notifyDataSetChanged() {
        RecyclerView.C16613e adapter = mo97707J7().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void onBackPressed() {
        mo97706I7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<C77094g> arrayList = this.f205637f;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C77094g(0, getString(C0966R.string.f8037zz)));
        arrayList2.add(new C77094g(1, getString(C0966R.string.in9)));
        arrayList2.add(new C77094g(2, getString(C0966R.string.ine)));
        arrayList2.add(new C77094g(3, getString(C0966R.string.ind)));
        arrayList2.add(new C77094g(4, getString(C0966R.string.inb)));
        arrayList2.add(new C77094g(5, getString(C0966R.string.in_)));
        arrayList2.add(new C77094g(6, getString(C0966R.string.ina)));
        arrayList2.add(new C77094g(7, getString(C0966R.string.inc)));
        arrayList.addAll(arrayList2);
        Integer valueOf = Integer.valueOf(C77091b.m93030l());
        this.f205641j = valueOf;
        if (valueOf != null && valueOf.intValue() == -1) {
            this.f205641j = 0;
        }
        this.f205642n = this.f205641j;
        initView();
    }

    public void onDestroy() {
        Ringtone ringtone = this.f205644p;
        if (ringtone != null) {
            ringtone.stop();
        }
        SoundPool soundPool = this.f205636e;
        if (soundPool != null) {
            soundPool.release();
        }
        super.onDestroy();
        this.f205643o.dead();
    }

    /* renamed from: y7 */
    public void mo97710y7(C77094g gVar) {
        C87412m.m108594g(gVar, "composition");
        Integer num = this.f205641j;
        int i = gVar.f225189a;
        if (num == null || num.intValue() != i) {
            enableOptionMenu(0, true);
        }
        String k = C77091b.m93029k(gVar.f225189a);
        this.f205645q = gVar;
        this.f205642n = Integer.valueOf(gVar.f225189a);
        Ringtone ringtone = this.f205644p;
        if (ringtone != null) {
            ringtone.stop();
        }
        Integer num2 = this.f205640i;
        if (num2 != null) {
            int intValue = num2.intValue();
            SoundPool soundPool = this.f205636e;
            if (soundPool != null) {
                soundPool.stop(intValue);
            }
        }
        if (gVar.f225189a != 0) {
            C87412m.m108593f(k, "path");
            if (this.f205636e == null) {
                this.f205636e = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(5).build()).build();
            }
            SoundPool soundPool2 = this.f205636e;
            if (soundPool2 != null) {
                soundPool2.load(C86013q1.m106448i(k, true), 1);
            }
            SoundPool soundPool3 = this.f205636e;
            if (soundPool3 != null) {
                soundPool3.setOnLoadCompleteListener(new C71161v0(this, k));
                return;
            }
            return;
        }
        Ringtone ringtone2 = RingtoneManager.getRingtone(getContext(), RingtoneManager.getDefaultUri(2));
        this.f205644p = ringtone2;
        if (ringtone2 != null) {
            ringtone2.play();
        }
    }
}
