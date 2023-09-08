package uw2;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31541z2;
import eb0.C75601x2;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p214om.C35193j;
import p331dj.C97481g;
import pu0.C110248b;
import sf0.C90189z;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: uw2.e */
public class C78291e extends C86301e implements C31541z2, C35193j {

    /* renamed from: i */
    public static HashMap<Integer, C91753f.C66827b> f229334i;

    /* renamed from: d */
    public C78306m f229335d;

    /* renamed from: e */
    public C90189z.C90190a f229336e;

    /* renamed from: f */
    public C78302l f229337f;

    /* renamed from: g */
    public List<Long> f229338g = new ArrayList();

    /* renamed from: h */
    public final Set<C75601x2> f229339h = new HashSet();

    /* renamed from: uw2.e$a */
    public class C78292a implements MediaPlayer.OnCompletionListener {
        public C78292a(C78291e eVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                mediaPlayer.release();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: uw2.e$b */
    public class C78293b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C78306m.f229381f;
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f229334i = hashMap;
        hashMap.put(1875231238, new C78293b());
    }

    public static C78291e vx0() {
        return (C78291e) C86312j.m106911c(C78291e.class);
    }

    public static C78302l wx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f229337f == null) {
            vx0().f229337f = new C78302l();
        }
        return vx0().f229337f;
    }

    public static C78306m xx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f229335d == null) {
            C78291e vx02 = vx0();
            vx0();
            if (vx0().f229336e == null) {
                vx0().f229336e = C90189z.m112866a(C78291e.class.hashCode(), C97625j3.m125812b().mo105901p() + "CommonOneMicroMsg.db", f229334i, false);
            }
            vx02.f229335d = new C78306m(vx0().f229336e);
        }
        return vx0().f229335d;
    }

    public void Ax0(String str) {
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(str);
        ((ArrayList) this.f229338g).clear();
        Cursor zs02 = ((C72972g4) C97625j3.m125812b().mo105911z()).zs0(str);
        zs02.moveToFirst();
        Log.m105918d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene");
        while (!zs02.isAfterLast()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(zs02);
            long msgId = f4Var.getMsgId();
            Log.m105918d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene: msgId = " + msgId + " status = " + f4Var.getStatus());
            zs02.moveToNext();
            ((ArrayList) this.f229338g).add(Long.valueOf(msgId));
        }
        zs02.close();
        ((C72972g4) C97625j3.m125812b().mo105911z()).By0(str);
    }

    /* renamed from: Pb */
    public C31541z2 mo59904Pb() {
        return this;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C78302l lVar = this.f229337f;
        if (lVar != null) {
            lVar.f229371j = 0;
        }
    }

    public boolean yx0(long j) {
        boolean contains = ((ArrayList) this.f229338g).contains(Long.valueOf(j));
        Log.m105918d("MicroMsg.SubCoreVoiceRemind", "silent " + contains + "  mid " + j);
        return contains;
    }

    public final void zx0(Context context, String str, boolean z) {
        Uri defaultUri = str == null ? RingtoneManager.getDefaultUri(2) : z ? FileProviderHelper.getUriForFile(context, C86009m1.m106378c(new File(str))) : Uri.parse(str);
        C97481g gVar = new C97481g();
        try {
            gVar.setDataSource(context, defaultUri);
            gVar.setOnCompletionListener(new C78292a(this));
            if (C110248b.yx0(5) == 0) {
                return;
            }
            if (C110248b.zx0()) {
                int yx02 = C110248b.yx0(8);
                C110248b.C110249a aVar = C110248b.f329777h;
                int d = aVar.mo161657b().mo157507d(8);
                int yx03 = C110248b.yx0(5);
                if (yx03 <= d) {
                    d = yx03;
                }
                aVar.mo161657b().mo157508g(8, d, 0);
                gVar.setAudioStreamType(8);
                gVar.setLooping(true);
                gVar.prepare();
                gVar.setLooping(false);
                gVar.start();
                aVar.mo161657b().mo157508g(8, yx02, 0);
                Log.m105919d("MicroMsg.SubCoreVoiceRemind", "oldVolume is %d, toneVolume is %d", Integer.valueOf(yx02), Integer.valueOf(d));
                return;
            }
            gVar.setAudioStreamType(5);
            gVar.setLooping(true);
            gVar.prepare();
            gVar.setLooping(false);
            gVar.start();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e, "", new Object[0]);
            gVar.release();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", th, "relese error", new Object[0]);
        }
    }
}
