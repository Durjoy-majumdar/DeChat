package zg2;

import ah2.C92000a;
import ai2.C92007a;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92012f;
import ai2.C92019m;
import ai2.C92020n;
import ai2.C92021o;
import ai2.C92024r;
import ai2.C92025s;
import ai2.C92026t;
import ai2.C92027u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import bi2.C104149h;
import bi2.C92262a;
import bi2.C92264c;
import bi2.C92265d;
import bi2.C92266e;
import bi2.C92267g;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fh2.C97880c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p1035sf.C90183c;
import p669qw.C36105b0;
import r80.C12962n0;
import sf0.C48374j0;
import sx3.C64197v;
import te3.C101769d70;
import te3.C101773e70;
import te3.C49044cs2;
import te3.C64339ea;
import te3.wb4;

/* renamed from: zg2.m */
public final class C103020m {

    /* renamed from: a */
    public static final C103020m f303985a = new C103020m();

    /* renamed from: b */
    public static final C39357g f303986b = ((C36105b0) C86312j.m106911c(C36105b0.class)).vx0();

    /* renamed from: c */
    public static Rect f303987c = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: d */
    public static Rect f303988d = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: e */
    public static final Rect f303989e = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: f */
    public static int f303990f = 54;

    /* renamed from: a */
    public final void mo142733a(String str) {
        C87412m.m108594g(str, "taskId");
        C39357g gVar = f303986b;
        gVar.getClass();
        ISQLiteDatabase iSQLiteDatabase = gVar.f105782d;
        String str2 = C39357g.f105781f;
        iSQLiteDatabase.delete(str2, "taskId=?", new String[]{"" + str});
    }

    /* renamed from: b */
    public final String mo142734b(Bundle bundle) {
        Set<String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (String next : keySet) {
            Object obj = bundle.get(next);
            if (obj instanceof List) {
                jSONObject.put(next, new JSONArray((Collection) obj));
            } else {
                jSONObject.put(next, bundle.get(next));
            }
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    /* renamed from: c */
    public final C103014f mo142735c(String str) {
        C87412m.m108594g(str, "taskId");
        return f303986b.mo62033jo(str);
    }

    /* renamed from: d */
    public final ArrayList<C92262a> mo142736d(LinkedList<C64339ea> linkedList, Context context) {
        C87412m.m108594g(linkedList, "baseItemData");
        C87412m.m108594g(context, "context");
        ArrayList<C92262a> arrayList = new ArrayList<>();
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        for (C64339ea eaVar : linkedList) {
            int i = eaVar.f182947d;
            if (i == 1) {
                arrayList.add(new C92026t(context).mo126001g(new C92025s(eaVar)));
            } else if (i == 2) {
                C92012f fVar = new C92012f(eaVar);
                IEmojiInfo iEmojiInfo = fVar.f263446g;
                C87412m.m108591d(iEmojiInfo);
                C92266e eVar = new C92266e(iEmojiInfo, fVar.f263407f);
                C101769d70 d702 = new C101769d70();
                d702.f298084d = fVar.f263404c.mo146049c();
                d702.f298085e = fVar.f263404c.mo146048b();
                eVar.f264074c = d702;
                arrayList.add(eVar);
            } else if (i == 3) {
                C92024r rVar = new C92024r(context);
                C92019m mVar = new C92019m(eaVar);
                arrayList.add(new C92264c(rVar.mo125996c(mVar), mVar.f263407f));
            } else if (i == 4) {
                C92027u uVar = new C92027u(context);
                C92025s sVar = new C92025s(eaVar);
                arrayList.add(new C92264c(uVar.mo126007c(sVar), sVar.f263407f));
            } else if (i == 5) {
                C92021o oVar = new C92021o(context);
                C92020n nVar = new C92020n(eaVar);
                oVar.mo125955o(nVar.f263463g);
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                Iterator<C49044cs2> it = oVar.f263487d.iterator();
                while (it.hasNext()) {
                    C49044cs2 next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Bitmap bitmap = oVar.f263474J.get(i2);
                        C87412m.m108593f(bitmap, "bitmapList[index]");
                        arrayList2.add(new C92267g(next, bitmap));
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                arrayList.add(new C104149h(arrayList2, nVar.f263407f));
            } else {
                C92011d dVar = C92011d.CAPTION;
                if (i == 6) {
                    byte[] bArr = eaVar.f182948e.f140574f.f257327a;
                    C87412m.m108593f(bArr, "it.itemData.buffer.bytes");
                    arrayList.add(new C92265d(new C92010c(dVar, bArr)));
                } else {
                    C92011d dVar2 = C92011d.RECORD_CAPTION;
                    if (i == 7) {
                        byte[] bArr2 = eaVar.f182948e.f140574f.f257327a;
                        C87412m.m108593f(bArr2, "it.itemData.buffer.bytes");
                        arrayList.add(new C92265d(new C92010c(dVar2, bArr2)));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final wb4 mo142737e(C101773e70 e702) {
        C87412m.m108594g(e702, "storyEditorProtoData");
        wb4 wb4 = new wb4();
        wb4.f299728f = C86013q1.m106456q(e702.f298161g);
        wb4.f299727e = C86013q1.m106456q(e702.f298164j);
        if (!Util.isNullOrNil((List) e702.f298152D)) {
            wb4.f299726d = "";
            wb4.f299730h = "";
            Iterator<String> it = e702.f298152D.iterator();
            while (it.hasNext()) {
                wb4.f299730h += C86013q1.m106456q(it.next());
            }
        } else {
            wb4.f299726d = C86013q1.m106456q(e702.f298158d);
            wb4.f299730h = "";
        }
        if (C90183c.m112859g(wb4.f299726d)) {
            wb4.f299726d = "";
        }
        wb4.f299729g = C86013q1.m106456q(e702.f298163i);
        return wb4;
    }

    /* renamed from: f */
    public final float[] mo142738f(C101773e70 e702) {
        C87412m.m108594g(e702, "storyEditorProtoData");
        return new float[]{(float) e702.f298169r, (float) e702.f298171t, (float) e702.f298170s, (float) e702.f298172u};
    }

    /* renamed from: g */
    public final float[] mo142739g(C101773e70 e702) {
        C87412m.m108594g(e702, "storyEditorProtoData");
        return new float[]{(float) e702.f298154F, (float) e702.f298156H, (float) e702.f298155G, (float) e702.f298157I};
    }

    /* renamed from: h */
    public final byte[] mo142740h(VideoMixer videoMixer, long j, List<C92007a> list) {
        long j2 = j;
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "is running serialize the videoEditorInfo to bytearray");
        C101773e70 e702 = new C101773e70();
        C92000a aVar = videoMixer.f272850a;
        C97880c cVar = aVar.f263370a;
        float[] fArr = aVar.f263372c;
        float[] fArr2 = aVar.f263373d;
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "input the timeStamp is " + j2);
        if (cVar.f287133i == 3) {
            C12962n0.C12963a aVar2 = C12962n0.f36985a;
            if (C86013q1.m106450k(aVar2.mo12495a(cVar.f287128d))) {
                e702.f298161g = aVar2.mo12495a(cVar.f287128d);
            }
        }
        e702.f298174w = j2;
        long j3 = cVar.f287130f;
        long j4 = 0;
        if (j3 == -1) {
            j3 = 0;
        }
        e702.f298159e = j3;
        e702.f298160f = cVar.f287131g;
        e702.f298163i = cVar.f287129e;
        String str = cVar.f287128d;
        e702.f298158d = str;
        e702.f298176y = cVar.f287132h;
        C94554a c = C94555d.m119567c(str, true);
        if (c != null) {
            long j5 = cVar.f287131g;
            if (j5 == -1 || j5 == 0) {
                e702.f298160f = (long) c.f273443a;
            }
        }
        if (!Util.isNullOrNil((List) cVar.f287136o)) {
            e702.f298160f = (long) 15000;
        }
        long j6 = e702.f298160f;
        if (j6 > 0) {
            j4 = j6;
        }
        e702.f298160f = j4;
        e702.f298152D.addAll(cVar.f287136o);
        e702.f298162h = cVar.f287133i;
        e702.f298169r = (int) fArr[0];
        e702.f298171t = (int) fArr[1];
        e702.f298170s = (int) fArr[2];
        e702.f298172u = (int) fArr[3];
        e702.f298173v = new LinkedList<>();
        if (fArr2 != null) {
            e702.f298154F = (int) fArr2[0];
            e702.f298156H = (int) fArr2[1];
            e702.f298155G = (int) fArr2[2];
            e702.f298157I = (int) fArr2[3];
        }
        AudioCacheInfo audioCacheInfo = cVar.f287134j;
        if (audioCacheInfo != null) {
            e702.f298164j = audioCacheInfo.f163817i;
            e702.f298165n = audioCacheInfo.f163813e;
            e702.f298166o = audioCacheInfo.f163814f;
            e702.f298167p = audioCacheInfo.f163818j;
            e702.f298168q = audioCacheInfo.f163819n;
            e702.f298150B = audioCacheInfo.f163828w;
            e702.f298151C = audioCacheInfo.f163829x;
        }
        e702.f298149A = f303985a.mo142737e(e702);
        for (C92007a aVar3 : list) {
            C64339ea eaVar = new C64339ea();
            eaVar.f182947d = aVar3.f263402a.f263445d;
            eaVar.f182948e = C48374j0.m53712a(aVar3.toProtoBuf().toByteArray());
            e702.f298173v.add(eaVar);
        }
        byte[] byteArray = e702.toByteArray();
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "storyEditorItem " + e702.f298158d + " thumb " + e702.f298163i + " and result " + C86013q1.m106450k(e702.f298163i) + " music " + e702.f298164j + " ret " + Util.getSizeKB(((long) byteArray.length) * 1) + '}');
        return byteArray;
    }
}
