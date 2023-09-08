package ge2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.performance.elf.ElfCallUpReceiver;
import com.tencent.p014mm.plugin.performance.elf.ElfCheckRequest;
import com.tencent.p014mm.plugin.performance.elf.ElfCheckResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: ge2.c */
public final class C32427c {

    /* renamed from: b */
    public static long f85997b = 1200000;

    /* renamed from: c */
    public static final C32427c f85998c = new C32427c();

    /* renamed from: d */
    public static final MMHandler f85999d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public static final C32430c f86000e = new C32430c((C32428a) null);

    /* renamed from: f */
    public static final Runnable f86001f = new C32429b((C32428a) null);

    /* renamed from: a */
    public boolean f86002a = false;

    /* renamed from: ge2.c$b */
    public static final class C32429b implements Runnable {
        public C32429b(C32428a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.ProcessElf", "send check broadcast!");
            ElfCheckRequest elfCheckRequest = new ElfCheckRequest();
            elfCheckRequest.f81889d = C32427c.f85997b;
            Intent intent = new Intent("ACTION_ELF_CHECK");
            intent.putExtra("MicroMsg.ElfCheckRequest", elfCheckRequest);
            MMApplicationContext.getContext().sendBroadcast(intent);
            C32427c.f85999d.postDelayed(this, C32427c.f85997b);
        }
    }

    /* renamed from: ge2.c$c */
    public static final class C32430c extends BroadcastReceiver {

        /* renamed from: ge2.c$c$a */
        public class C32431a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f86003d;

            public C32431a(C32430c cVar, Context context) {
                this.f86003d = context;
            }

            public void run() {
                Intent intent = new Intent(this.f86003d, ElfCallUpReceiver.class);
                intent.setAction(ElfCallUpReceiver.class.getName());
                this.f86003d.sendBroadcast(intent);
            }
        }

        public C32430c(C32428a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("ACTION_ELF_CHECK_RESPONSE".equals(intent.getAction())) {
                ElfCheckResponse elfCheckResponse = (ElfCheckResponse) intent.getParcelableExtra("MicroMsg.ElfCheckResponse");
                if (elfCheckResponse == null) {
                    Log.m105924i("MicroMsg.ProcessElf", "[onReceive] response is null!");
                    return;
                }
                if (!elfCheckResponse.f81891e) {
                    C32427c.f85999d.removeCallbacksAndMessages((Object) null);
                }
                MMHandler mMHandler = C32427c.f85999d;
                if (!elfCheckResponse.f81891e || !elfCheckResponse.f81890d || !elfCheckResponse.f81893g) {
                    Log.m105929w("MicroMsg.ElfCheckResponse", "can't call process[%s]", elfCheckResponse.f81895i);
                    z = false;
                } else {
                    mMHandler.postDelayed(new C32425a(elfCheckResponse, context), elfCheckResponse.f81897n);
                    z = true;
                }
                Log.m105925i("MicroMsg.ProcessElf", "[onReceive] %s, isEnable:%s, CHECK_TIME:%s", Boolean.valueOf(z), Boolean.valueOf(elfCheckResponse.f81891e), Long.valueOf(C32427c.f85997b));
            } else if ("com.tencent.mm.MMUIModeManager".equals(intent.getAction())) {
                Log.m105924i("MicroMsg.ProcessElf", "restart mm for uimode change!");
                new Handler(Looper.getMainLooper()).postDelayed(new C32431a(this, context), 500);
            }
        }
    }

    /* renamed from: a */
    public static boolean m39719a(float f) {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_android_process_hard_info, "");
        if (!TextUtils.isEmpty(Y60)) {
            try {
                JSONArray jSONArray = new JSONObject(Y60).getJSONArray("hard-open");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("device-brand");
                    String string2 = jSONObject.getString("device-model");
                    int i2 = jSONObject.getInt("sdk-version");
                    String str = Build.BRAND + " " + C87203t.m108275k();
                    int i3 = Build.VERSION.SDK_INT;
                    Log.m105925i("MicroMsg.ProcessElf", "[checkHardOpen] name:%s model:%s version:%s | %s %s ", string, string2, Integer.valueOf(i2), str, Integer.valueOf(i3));
                    if (i2 <= i3 && str.contains(string) && str.contains(string2)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ProcessElf", e, "", new Object[0]);
            }
        } else {
            Log.m105924i("MicroMsg.ProcessElf", "[checkHardOpen] json is Empty! just pass!");
        }
        int nextInt = new Random().nextInt(10000);
        boolean z = 10000.0f * f > ((float) nextInt);
        Log.m105925i("MicroMsg.ProcessElf", "[checkHardOpen] rand:%s test:%s isEnable:%s", Float.valueOf(f), Integer.valueOf(nextInt), Boolean.valueOf(z));
        return z;
    }
}
