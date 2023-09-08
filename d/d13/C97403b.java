package d13;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.TranslateMessageResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g13.C98071g;
import g13.C98076h;
import java.util.LinkedList;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: d13.b */
public class C97403b extends C86301e {

    /* renamed from: d */
    public C98071g f285906d = C98071g.C98074c.f287525a;

    /* renamed from: e */
    public QueueWorkerThread f285907e = new QueueWorkerThread(5, "ProcessTranslatedMessage", 1, Looper.getMainLooper());

    /* renamed from: f */
    public C98071g.C98073b f285908f = new C97404a();

    /* renamed from: g */
    public MMHandler f285909g = new MMHandler(Looper.getMainLooper());

    /* renamed from: d13.b$a */
    public class C97404a implements C98071g.C98073b {

        /* renamed from: d13.b$a$a */
        public class C97405a implements QueueWorkerThread.ThreadObject {

            /* renamed from: d */
            public final /* synthetic */ int f285911d;

            /* renamed from: e */
            public final /* synthetic */ C98071g.C98075d f285912e;

            public C97405a(int i, C98071g.C98075d dVar) {
                this.f285911d = i;
                this.f285912e = dVar;
            }

            public boolean doInBackground() {
                Log.m105919d("MicroMsg.SubCoreTranslate", "finish translated, id: %s", this.f285912e.f287529c);
                if (this.f285911d != 0) {
                    Log.m105920e("MicroMsg.SubCoreTranslate", "translate error");
                    return true;
                }
                C98071g.C98075d dVar = this.f285912e;
                int i = dVar.f287536j;
                if (i != 0) {
                    Log.m105921e("MicroMsg.SubCoreTranslate", "translate ret not ok : %s", Integer.valueOf(i));
                    return true;
                } else if (Util.isNullOrNil(dVar.f287528b)) {
                    Log.m105920e("MicroMsg.SubCoreTranslate", "translate return null");
                    return true;
                } else {
                    int i2 = this.f285912e.f287534h;
                    if (i2 == 0 || i2 == 1) {
                        Log.m105918d("MicroMsg.SubCoreTranslate", "we recieved one translated message");
                        C97403b bVar = C97403b.this;
                        C98071g.C98075d dVar2 = this.f285912e;
                        bVar.getClass();
                        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(Util.safeParseLong(dVar2.f287529c));
                        b002.mo108758i3(dVar2.f287528b);
                        b002.mo108757h3(Util.escapeSqlValue(Util.nullAsNil(dVar2.f287531e)));
                        b002.f230736T = dVar2.f287532f;
                        b002.f230755r = true;
                        if (dVar2.f287533g == 1) {
                            if (b002.mo101015s3()) {
                                b002.mo108743W2(b002.f230723F | 1024);
                            }
                        } else if (b002.mo101015s3()) {
                            b002.mo108743W2(b002.f230723F & -1025);
                        }
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(b002.getMsgId(), b002);
                    }
                    return true;
                }
            }

            public boolean onPostExecute() {
                int i = this.f285911d;
                if (i == 0) {
                    i = this.f285912e.f287536j;
                }
                TranslateMessageResultEvent translateMessageResultEvent = new TranslateMessageResultEvent();
                TranslateMessageResultEvent.C92608a aVar = translateMessageResultEvent.f265243d;
                aVar.f265244a = i;
                C98071g.C98075d dVar = this.f285912e;
                aVar.f265245b = dVar.f287527a;
                aVar.f265247d = dVar.f287529c;
                aVar.f265246c = dVar.f287528b;
                aVar.f265248e = dVar.f287534h;
                aVar.f265249f = dVar.f287530d;
                aVar.f265250g = dVar.f287531e;
                aVar.f265251h = dVar.f287532f;
                aVar.f265252i = dVar.f287533g;
                translateMessageResultEvent.publish();
                return false;
            }
        }

        public C97404a() {
        }

        /* renamed from: a */
        public void mo136672a(int i, SparseArray<C98071g.C98075d> sparseArray) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                C98071g.C98075d valueAt = sparseArray.valueAt(i2);
                if (valueAt != null) {
                    C97403b.this.f285907e.add(new C97405a(i, valueAt));
                }
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C98071g gVar = this.f285906d;
        C98071g.C98073b bVar = this.f285908f;
        if (bVar == null) {
            gVar.getClass();
        } else if (!gVar.f287522c.contains(bVar)) {
            gVar.f287522c.add(bVar);
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C98071g gVar = this.f285906d;
        C98071g.C98073b bVar = this.f285908f;
        if (bVar == null) {
            gVar.getClass();
        } else if (gVar.f287522c.contains(bVar)) {
            gVar.f287522c.remove(bVar);
        }
        C98071g gVar2 = this.f285906d;
        C98076h[] hVarArr = gVar2.f287521b;
        if (hVarArr != null) {
            for (C98076h hVar : hVarArr) {
                if (hVar != null) {
                    C97625j3.m125815e().mo123470p(631, hVar);
                    if (hVar.f287540f != null) {
                        hVar.f287544j.stopTimer();
                        C97625j3.m125815e().mo123458d(hVar.f287540f);
                    }
                    hVar.f287540f = null;
                    hVar.f287539e = false;
                    hVar.f287538d = null;
                }
            }
        }
        gVar2.f287524e.clear();
        ((LinkedList) gVar2.f287523d).clear();
        gVar2.f287522c.clear();
        gVar2.f287520a = 0;
    }
}
