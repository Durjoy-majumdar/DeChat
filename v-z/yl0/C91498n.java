package yl0;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;

/* renamed from: yl0.n */
public final class C91498n extends C87413o implements C32228q<byte[], List<? extends String>, List<? extends NdefMessage>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C82381f f262303d;

    /* renamed from: e */
    public final /* synthetic */ C91499o f262304e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91498n(C82381f fVar, C91499o oVar) {
        super(3);
        this.f262303d = fVar;
        this.f262304e = oVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        byte[] bArr = (byte[]) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        C87412m.m108594g(list, "techs");
        if (list2 != null) {
            Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "messages2Map, messages: " + list2);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                char c = 0;
                if (!it.hasNext()) {
                    break;
                }
                NdefMessage ndefMessage = (NdefMessage) it.next();
                Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "message2MessageMap, message: " + ndefMessage);
                NdefRecord[] records = ndefMessage.getRecords();
                C87412m.m108593f(records, "message.records");
                ArrayList arrayList2 = new ArrayList(records.length);
                int length = records.length;
                int i = 0;
                while (i < length) {
                    NdefRecord ndefRecord = records[i];
                    C87412m.m108593f(ndefRecord, LocaleUtil.ITALIAN);
                    Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "record2RecordMap, record: " + ndefRecord);
                    C13604l[] lVarArr = new C13604l[3];
                    lVarArr[c] = new C13604l("tnf", Short.valueOf(ndefRecord.getTnf()));
                    byte[] encode = Base64.encode(ndefRecord.getType(), 2);
                    C87412m.m108593f(encode, "encode(record.type, Base64.NO_WRAP)");
                    Charset charset = StandardCharsets.UTF_8;
                    C87412m.m108593f(charset, "UTF_8");
                    lVarArr[1] = new C13604l("type", new String(encode, charset));
                    byte[] encode2 = Base64.encode(ndefRecord.getId(), 2);
                    C87412m.m108593f(encode2, "encode(record.id, Base64.NO_WRAP)");
                    Charset charset2 = StandardCharsets.UTF_8;
                    C87412m.m108593f(charset2, "UTF_8");
                    lVarArr[2] = new C13604l("id", new String(encode2, charset2));
                    Map f = C90364q0.m113147f(lVarArr);
                    Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "record2RecordMap, map: " + f);
                    arrayList2.add(new C13604l(f, C84782s1.m104464e(ndefRecord.getPayload())));
                    i++;
                    c = 0;
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add((Map) ((C13604l) it4.next()).f38555d);
                }
                ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add((ByteBuffer) ((C13604l) it5.next()).f38556e);
                }
                C13604l lVar = new C13604l(arrayList3, arrayList4);
                Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "message2MessageMap, messageMap: " + lVar);
                arrayList.add(lVar);
            }
            C13604l[] lVarArr2 = new C13604l[1];
            ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList5.add((List) ((C13604l) it6.next()).f38555d);
            }
            lVarArr2[0] = new C13604l("messages", arrayList5);
            Map g = C90364q0.m113148g(lVarArr2);
            Iterator it7 = arrayList.iterator();
            int i2 = 0;
            while (it7.hasNext()) {
                Object next = it7.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    int i4 = 0;
                    for (Object next2 : (Iterable) ((C13604l) next).f38556e) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            g.put("payload-" + i2 + '-' + i4, (ByteBuffer) next2);
                            i4 = i5;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "messages2Map, map: " + g);
            HashMap hashMap = new HashMap(g);
            if (C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(this.f262303d.getJsRuntime(), hashMap, (C84782s1.C84783a) this.f262303d.mo109671p(C84782s1.C84783a.class))) {
                Log.m105928w("MicroMsg.AppBrand.JsApiStartNFCDiscovery", "invoke, convert NativeBuffer fail");
            } else {
                C91480d dVar = (C91480d) ((C36570n) this.f262304e.f262305g).getValue();
                dVar.mo125419q(this.f262303d);
                dVar.mo125418p(bArr, list, hashMap);
            }
        } else {
            C91480d dVar2 = (C91480d) ((C36570n) this.f262304e.f262305g).getValue();
            dVar2.mo125419q(this.f262303d);
            dVar2.mo125418p(bArr, list, (HashMap<String, Object>) null);
        }
        return C13598b0.f38549a;
    }
}
