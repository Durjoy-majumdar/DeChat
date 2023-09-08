package y40;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.view.BaseLivePluginLayout;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import com.tencent.p014mm.live.view.LiveVisitorPluginLayout;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: y40.a */
public final class C66491a {

    /* renamed from: a */
    public final Context f191274a;

    /* renamed from: b */
    public final ViewGroup f191275b;

    /* renamed from: c */
    public final LiveConfig f191276c;

    /* renamed from: d */
    public final boolean f191277d;

    /* renamed from: e */
    public final String f191278e = "MicroMsg.LiveUIRouter";

    /* renamed from: f */
    public final SharedPreferences f191279f;

    /* renamed from: g */
    public final C66492a f191280g;

    /* renamed from: h */
    public final SparseArray<Class<?>> f191281h;

    /* renamed from: i */
    public final SparseArray<BaseLivePluginLayout> f191282i;

    /* renamed from: j */
    public BaseLivePluginLayout f191283j;

    /* renamed from: k */
    public boolean f191284k;

    /* renamed from: l */
    public KeyboardHeightProvider f191285l;

    /* renamed from: m */
    public final PhoneStateListener f191286m;

    /* renamed from: y40.a$a */
    public static final class C66492a extends ContentObserver {

        /* renamed from: a */
        public final C32224a<C13598b0> f191287a;

        /* renamed from: b */
        public ContentResolver f191288b;

        public C66492a(Handler handler, C32224a<C13598b0> aVar) {
            super(handler);
            this.f191287a = aVar;
            ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
            C87412m.m108593f(contentResolver, "getContext().contentResolver");
            this.f191288b = contentResolver;
        }

        public void onChange(boolean z) {
            super.onChange(z);
            C32224a<C13598b0> aVar = this.f191287a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: y40.a$b */
    public static final class C66493b extends PhoneStateListener {

        /* renamed from: a */
        public final /* synthetic */ C66491a f191289a;

        public C66493b(C66491a aVar) {
            this.f191289a = aVar;
        }

        public void onCallStateChanged(int i, String str) {
            C87412m.m108594g(str, "incomingNumber");
            BaseLivePluginLayout baseLivePluginLayout = this.f191289a.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.onCallStateChanged(i, str);
            }
        }
    }

    /* renamed from: y40.a$c */
    public static final class C66494c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66491a f191290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66494c(C66491a aVar) {
            super(0);
            this.f191290d = aVar;
        }

        public Object invoke() {
            BaseLivePluginLayout baseLivePluginLayout = this.f191290d.f191283j;
            if (baseLivePluginLayout != null) {
                boolean z = false;
                if (Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation") == 1 && this.f191290d.f191279f.getBoolean("settings_landscape_mode", false)) {
                    z = true;
                }
                baseLivePluginLayout.onRotationSwitchChange(z);
            }
            return C13598b0.f38549a;
        }
    }

    public C66491a(Context context, ViewGroup viewGroup, LiveConfig liveConfig, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "root");
        this.f191274a = context;
        this.f191275b = viewGroup;
        this.f191276c = liveConfig;
        this.f191277d = z;
        SharedPreferences sharedPreferences = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4);
        C87412m.m108593f(sharedPreferences, "context.getSharedPrefere…ntext.MODE_MULTI_PROCESS)");
        this.f191279f = sharedPreferences;
        this.f191280g = new C66492a(new Handler(Looper.getMainLooper()), new C66494c(this));
        SparseArray<Class<?>> sparseArray = new SparseArray<>();
        this.f191281h = sparseArray;
        this.f191282i = new SparseArray<>();
        this.f191286m = new C66493b(this);
        Log.m105924i("MicroMsg.LiveUIRouter", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        sparseArray.put(0, LiveAnchorPluginLayout.class);
        sparseArray.put(1, LiveVisitorPluginLayout.class);
    }

    /* renamed from: a */
    public void mo90580a(int i) {
        if (this.f191282i.get(i) == null) {
            Class<?> cls = this.f191281h.get(i);
            C87412m.m108593f(cls, "viewTable[toWhere]");
            try {
                Object newInstance = cls.getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{this.f191274a, null});
                C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.live.view.BaseLivePluginLayout");
                BaseLivePluginLayout baseLivePluginLayout = (BaseLivePluginLayout) newInstance;
                LiveConfig liveConfig = this.f191276c;
                if (liveConfig == null) {
                    liveConfig = LiveConfig.m62801a("", 2);
                }
                baseLivePluginLayout.initLogic(liveConfig, this.f191277d);
                this.f191282i.put(i, baseLivePluginLayout);
                this.f191275b.addView(baseLivePluginLayout, new ViewGroup.LayoutParams(-1, -1));
                baseLivePluginLayout.setVisibility(8);
            } catch (Exception e) {
                Log.printErrStackTrace(this.f191278e, e, "", new Object[0]);
            }
        }
        BaseLivePluginLayout baseLivePluginLayout2 = this.f191283j;
        BaseLivePluginLayout baseLivePluginLayout3 = this.f191282i.get(i);
        this.f191283j = baseLivePluginLayout3;
        if (baseLivePluginLayout3 != null) {
            baseLivePluginLayout3.mount();
        }
        BaseLivePluginLayout baseLivePluginLayout4 = this.f191283j;
        if (baseLivePluginLayout4 != null) {
            baseLivePluginLayout4.bringToFront();
        }
        if (baseLivePluginLayout2 != null) {
            baseLivePluginLayout2.pause();
        }
    }
}
