package p375qh;

import android.media.AudioRecord;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import java.util.Arrays;
import p375qh.C110390f;
import p375qh.C110394i;

/* renamed from: qh.g */
public class C110392g extends C110394i {

    /* renamed from: d */
    public AudioRecord f330249d;

    /* renamed from: e */
    public HandlerThread f330250e = null;

    /* renamed from: f */
    public C89658b f330251f;

    /* renamed from: g */
    public byte[] f330252g = null;

    /* renamed from: h */
    public boolean f330253h;

    /* renamed from: i */
    public int f330254i;

    /* renamed from: j */
    public int f330255j;

    /* renamed from: k */
    public boolean f330256k;

    /* renamed from: l */
    public AudioRecord.OnRecordPositionUpdateListener f330257l = new C110393a();

    /* renamed from: qh.g$a */
    public class C110393a implements AudioRecord.OnRecordPositionUpdateListener {
        public C110393a() {
        }

        public void onMarkerReached(AudioRecord audioRecord) {
        }

        public void onPeriodicNotification(AudioRecord audioRecord) {
            C110392g.this.getClass();
            C110392g gVar = C110392g.this;
            AudioRecord audioRecord2 = gVar.f330249d;
            if (audioRecord2 != null) {
                if (gVar.f330253h || gVar.f330252g == null) {
                    gVar.f330252g = new byte[gVar.f330255j];
                }
                int read = audioRecord2.read(gVar.f330252g, 0, gVar.f330255j);
                Log.m105918d("MicroMsg.RecordModeAsyncCallback", "OnRecordPositionUpdateListener, read ret: " + read);
                C110392g gVar2 = C110392g.this;
                C110394i.C110395a aVar = gVar2.f330259a;
                if (aVar != null) {
                    ((C110390f.C110391a) aVar).mo161910a(read, gVar2.f330252g);
                }
                C110392g gVar3 = C110392g.this;
                byte[] bArr = gVar3.f330252g;
                if (read > bArr.length) {
                    read = bArr.length;
                }
                if (gVar3.f330256k && read > 0) {
                    Arrays.fill(bArr, 0, read, (byte) 0);
                }
                C110392g gVar4 = C110392g.this;
                C89658b bVar = gVar4.f330251f;
                if (bVar != null && read > 0) {
                    bVar.mo35508a(gVar4.f330252g, read);
                }
            }
        }
    }

    public C110392g(AudioRecord audioRecord, C89658b bVar, boolean z, int i, int i2) {
        this.f330249d = audioRecord;
        this.f330251f = bVar;
        this.f330253h = z;
        this.f330254i = i;
        this.f330255j = i2;
    }

    /* renamed from: a */
    public boolean mo35180a() {
        if (this.f330250e != null) {
            Log.m105920e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
            return false;
        }
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("RecordModeAsyncCallback_handlerThread", 10);
        this.f330250e = a;
        a.start();
        this.f330249d.setRecordPositionUpdateListener(this.f330257l, MMHandler.createFreeHandler(this.f330250e.getLooper()));
        this.f330249d.setPositionNotificationPeriod(this.f330254i);
        if (this.f330253h || this.f330252g == null) {
            this.f330252g = new byte[this.f330255j];
        }
        int read = this.f330249d.read(this.f330252g, 0, this.f330255j);
        Log.m105918d("MicroMsg.RecordModeAsyncCallback", "startRecord, read ret: " + read);
        C89658b bVar = this.f330251f;
        if (bVar == null || read <= 0) {
            return true;
        }
        bVar.mo35508a(this.f330252g, read);
        return true;
    }

    /* renamed from: b */
    public void mo35181b() {
        this.f330249d.setRecordPositionUpdateListener((AudioRecord.OnRecordPositionUpdateListener) null);
        this.f330249d = null;
        this.f330250e.quit();
        this.f330250e = null;
    }

    /* renamed from: c */
    public void mo35182c(boolean z) {
        this.f330256k = z;
    }
}
