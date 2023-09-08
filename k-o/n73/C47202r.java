package n73;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.qqpinyin.voicerecoapi.C116361c;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import m73.C46951c;
import o73.C47335c;
import ob0.C11385n;
import ob0.C117747y;
import p375qh.C101193k;
import p492dn.C45427v;
import p827uh.C52575d;
import pe3.C89349b;
import te3.v15;
import te3.w15;

/* renamed from: n73.r */
public class C47202r implements C11385n {

    /* renamed from: o */
    public static final String f126747o = (C72994y1.f212832a + "tmp_wearvoicetotext.spx");

    /* renamed from: d */
    public C46951c f126748d;

    /* renamed from: e */
    public C116361c f126749e;

    /* renamed from: f */
    public C52575d f126750f;

    /* renamed from: g */
    public boolean f126751g = false;

    /* renamed from: h */
    public int f126752h = 0;

    /* renamed from: i */
    public int f126753i;

    /* renamed from: j */
    public int f126754j;

    /* renamed from: n */
    public LinkedList<Integer> f126755n = new LinkedList<>();

    /* renamed from: n73.r$a */
    public class C47203a extends C47335c {

        /* renamed from: d */
        public int f126756d = 2;

        /* renamed from: e */
        public int f126757e;

        /* renamed from: f */
        public int f126758f;

        /* renamed from: g */
        public w15 f126759g;

        public C47203a(C47202r rVar, int i, int i2, w15 w15) {
            this.f126757e = i;
            this.f126758f = i2;
            this.f126759g = w15;
        }

        /* renamed from: b */
        public String mo67621b() {
            return "WearVoiceToTextTask";
        }

        /* renamed from: c */
        public void mo67622c() {
            try {
                byte[] b = C43457b.xx0().mo176381b(this.f126759g.toByteArray());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeInt(this.f126756d);
                    dataOutputStream.writeInt(this.f126757e);
                    dataOutputStream.writeInt(this.f126758f);
                    if (b == null || b.length <= 0) {
                        dataOutputStream.writeInt(0);
                    } else {
                        dataOutputStream.writeInt(b.length);
                        dataOutputStream.write(b);
                    }
                    Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "send data funId=%d length=%d", Integer.valueOf(this.f126758f), Integer.valueOf(byteArrayOutputStream.toByteArray().length));
                    C43457b.xx0().mo176384e(byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Wear.VoiceToTextServer", e, "gen response data error connectType=%d, sessionId=%d, funId=%d", Integer.valueOf(this.f126756d), Integer.valueOf(this.f126757e), Integer.valueOf(this.f126758f));
                }
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.Wear.VoiceToTextServer", e2, "", new Object[0]);
            }
        }
    }

    public C47202r() {
        C45427v.m50377a();
    }

    /* renamed from: a */
    public final void mo72266a(int i, v15 v15) {
        int i2;
        C89349b bVar = v15.f143251f;
        if (bVar == null) {
            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "voice data is null");
            return;
        }
        byte[] f = bVar.mo123703f();
        int d = this.f126752h + this.f126750f.mo73540d(new C101193k.C101194a(f, v15.f143250e), 0, false);
        this.f126752h = d;
        Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "write bytes: %d", Integer.valueOf(d));
        short[] sArr = new short[(v15.f143250e / 2)];
        int i3 = 0;
        while (true) {
            i2 = v15.f143250e;
            if (i3 >= i2 / 2) {
                break;
            }
            int i4 = i3 * 2;
            sArr[i3] = (short) ((f[i4 + 1] << 8) | (f[i4] & ExifInterface.MARKER));
            i3++;
        }
        C116361c.C45130a aVar = new C116361c.C45130a();
        this.f126749e.mo178018a(sArr, i2 / 2, aVar);
        Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "state.vad_flag: " + aVar.f122402a);
        int i5 = aVar.f122402a;
        if (i5 == 2) {
            this.f126754j = 1;
        } else if (i5 == 3) {
            this.f126754j = 2;
        }
        int i6 = this.f126754j;
        if (i6 != 0) {
            if (i6 < 0) {
                if (this.f126755n.size() > 10) {
                    this.f126755n.removeLast();
                }
                this.f126755n.addFirst(Integer.valueOf(i));
            }
            if (this.f126754j == 1) {
                w15 w15 = new w15();
                w15.f143814d = this.f126748d.f126239f;
                w15.f143815e = "";
                w15.f143817g = this.f126754j;
                w15.f143816f = true;
                C43457b.Ax0().mo67630a(new C47203a(this, this.f126748d.f126241h, 30001, w15));
                this.f126754j = 0;
            }
        }
        if (!this.f126751g && this.f126752h > 3300) {
            this.f126751g = true;
            C97625j3.m125815e().mo123460f(this.f126748d);
        }
    }

    /* renamed from: b */
    public final void mo72267b() {
        Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "reset: sessionId=%s", Integer.valueOf(this.f126753i));
        C52575d dVar = this.f126750f;
        if (dVar != null) {
            dVar.mo73541e();
            this.f126750f = null;
            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "reset speexWriter");
        }
        C116361c cVar = this.f126749e;
        if (cVar != null) {
            cVar.mo178020c();
            this.f126749e = null;
            Log.m105924i("MicroMsg.Wear.VoiceToTextServer", "reset voiceDetectAPI");
        }
        C46951c cVar2 = this.f126748d;
        if (cVar2 != null) {
            cVar2.f126243j = true;
            C97625j3.m125815e().mo123470p(349, this);
            C97625j3.m125815e().mo123458d(this.f126748d);
            this.f126748d = null;
        }
        this.f126754j = 0;
        this.f126751g = false;
        this.f126752h = 0;
        this.f126753i = -1;
        this.f126755n.clear();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C46951c) {
            C46951c cVar = (C46951c) yVar;
            if (i != 0 || i2 != 0) {
                C97625j3.m125815e().mo123470p(349, this);
                w15 w15 = new w15();
                w15.f143814d = cVar.f126239f;
                w15.f143815e = "";
                w15.f143817g = -1;
                w15.f143816f = false;
                C43457b.Ax0().mo67630a(new C47203a(this, cVar.f126241h, 30001, w15));
            } else if (cVar.f126248r) {
                C97625j3.m125815e().mo123470p(349, this);
                w15 w152 = new w15();
                w152.f143814d = cVar.f126239f;
                if (!Util.isNullOrNil(cVar.f126247q)) {
                    Log.m105925i("MicroMsg.Wear.VoiceToTextServer", "receive text: %s", cVar.f126247q);
                    w152.f143815e = cVar.f126247q;
                    w152.f143817g = 0;
                    w152.f143816f = true;
                } else {
                    w152.f143815e = "";
                    w152.f143817g = -1;
                    w152.f143816f = false;
                }
                C43457b.Ax0().mo67630a(new C47203a(this, cVar.f126241h, 30001, w152));
            }
        }
    }
}
