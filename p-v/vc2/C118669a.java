package vc2;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import ft3.C116896h;
import h81.C32735h;
import java.util.UUID;
import p182kk.C61104a;
import wc2.C118754a;
import xc2.C118871b;

/* renamed from: vc2.a */
public class C118669a {

    /* renamed from: c */
    public static final C116896h<C118669a> f355102c = new C118670a();

    /* renamed from: a */
    public long f355103a = 0;

    /* renamed from: b */
    public MMHandler f355104b = new C118671b();

    /* renamed from: vc2.a$a */
    public class C118670a extends C116896h<C118669a> {
        /* renamed from: a */
        public Object mo165606a() {
            return new C118669a();
        }
    }

    /* renamed from: vc2.a$b */
    public class C118671b extends MMHandler {
        public C118671b() {
        }

        /* renamed from: a */
        public final void mo183390a(int i, long j, boolean z) {
            int i2;
            Class cls = C32735h.class;
            Log.m105925i("MicroMsg.FLST", "handle msg %d ", 1);
            if (z) {
                C118669a aVar = C118669a.this;
                long j2 = aVar.f355103a;
                if (j2 == 0) {
                    aVar.f355103a = j;
                } else if (j2 != j) {
                    aVar.f355103a = j;
                } else {
                    return;
                }
            } else if (C118669a.this.f355103a != j) {
                return;
            }
            if (!C61104a.m71656l(MMApplicationContext.getContext(), false)) {
                C118669a aVar2 = C118669a.this;
                aVar2.getClass();
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.obj = Long.valueOf(j);
                aVar2.f355104b.sendMessageAtFrontOfQueue(obtain);
                return;
            }
            String str = "FinderLive_" + j + "_" + UUID.randomUUID().toString();
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                i2 = 100;
            } else {
                i2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finderlive_sensor_max_sampling_count, 0);
                if (i2 <= 0) {
                    i2 = 0;
                }
            }
            C118871b bVar = new C118871b(str, i2);
            if (i2 > 0) {
                C118754a b = C118754a.f355286d.mo180860b();
                b.mo183481d(1, i, bVar, 0);
                b.mo183481d(3, 0, bVar.f355595c, (long) bVar.f355594b);
                int i3 = bVar.f355594b;
                if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                    i3 = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                } else {
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finderlive_sensor_report_interval, 0);
                    if (Qe > i3) {
                        i3 = Qe;
                    }
                }
                if (i3 > 0) {
                    C118669a aVar3 = C118669a.this;
                    aVar3.getClass();
                    Message obtain2 = Message.obtain();
                    obtain2.what = 1;
                    obtain2.arg1 = i;
                    obtain2.arg2 = 0;
                    obtain2.obj = Long.valueOf(j);
                    aVar3.f355104b.sendMessageDelayed(obtain2, (long) i3);
                }
            }
        }

        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 1) {
                    mo183390a(message.arg1, ((Long) message.obj).longValue(), message.arg2 > 0);
                } else if (i == 2) {
                    ((Long) message.obj).longValue();
                    Log.m105925i("MicroMsg.FLST", "handle msg %d ", 1);
                    C118669a.this.f355104b.removeMessages(1);
                    C118669a.this.f355103a = 0;
                }
            } catch (Throwable th) {
                Log.m105925i("MicroMsg.FLST", "handle msg %d error: %s", Integer.valueOf(message.what), th.toString());
            }
        }
    }
}
