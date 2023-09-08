package com.tencent.p014mm.plugin.scanner.model;

import android.content.Context;
import android.graphics.Point;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19933b;
import com.tencent.qbar.C19934c;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.WxQbarNative;
import it3.C98797b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p200lx.C99712h0;

/* renamed from: com.tencent.mm.plugin.scanner.model.c0 */
public class C94477c0 extends IStaticListener<IEvent> {

    /* renamed from: d */
    public Map<Long, String> f273182d = new HashMap();

    /* renamed from: e */
    public C99712h0.C99713a f273183e = new C94478a();

    /* renamed from: com.tencent.mm.plugin.scanner.model.c0$a */
    public class C94478a implements C99712h0.C99713a {

        /* renamed from: com.tencent.mm.plugin.scanner.model.c0$a$a */
        public class C94479a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f273185d;

            /* renamed from: e */
            public final /* synthetic */ long f273186e;

            /* renamed from: f */
            public final /* synthetic */ C99712h0.C99715c f273187f;

            /* renamed from: g */
            public final /* synthetic */ List f273188g;

            /* renamed from: h */
            public final /* synthetic */ List f273189h;

            public C94479a(List list, long j, C99712h0.C99715c cVar, List list2, List list3) {
                this.f273185d = list;
                this.f273186e = j;
                this.f273187f = cVar;
                this.f273188g = list2;
                this.f273189h = list3;
            }

            public void run() {
                List list = this.f273185d;
                if (list == null || list.isEmpty()) {
                    Log.m105925i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file no result", Long.valueOf(this.f273186e));
                    if (((HashMap) C94477c0.this.f273182d).containsKey(Long.valueOf(this.f273186e))) {
                        RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = new RecogQBarOfImageFileFailedEvent();
                        recogQBarOfImageFileFailedEvent.f107738d.f107739a = (String) ((HashMap) C94477c0.this.f273182d).get(Long.valueOf(this.f273186e));
                        recogQBarOfImageFileFailedEvent.publish();
                        ((HashMap) C94477c0.this.f273182d).remove(Long.valueOf(this.f273186e));
                        return;
                    }
                    return;
                }
                Log.m105925i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file get %d results ", Long.valueOf(this.f273186e), Integer.valueOf(this.f273185d.size()));
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = new RecogQBarOfImageFileResultEvent();
                if (((HashMap) C94477c0.this.f273182d).containsKey(Long.valueOf(this.f273186e))) {
                    recogQBarOfImageFileResultEvent.f265015d.f265016a = (String) ((HashMap) C94477c0.this.f273182d).get(Long.valueOf(this.f273186e));
                    C99712h0.C99715c cVar = this.f273187f;
                    Point point = cVar.f292254d;
                    if (point != null) {
                        RecogQBarOfImageFileResultEvent.C92550a aVar = recogQBarOfImageFileResultEvent.f265015d;
                        aVar.f265022g = point.x;
                        aVar.f265023h = point.y;
                    }
                    RecogQBarOfImageFileResultEvent.C92550a aVar2 = recogQBarOfImageFileResultEvent.f265015d;
                    aVar2.f265026k = cVar.f292255e;
                    aVar2.f265017b = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265019d = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265021f = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265018c = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265020e = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265024i = new ArrayList();
                    recogQBarOfImageFileResultEvent.f265015d.f265025j = new ArrayList();
                    for (C19931a.C19932a aVar3 : this.f273185d) {
                        recogQBarOfImageFileResultEvent.f265015d.f265017b.add(aVar3.f56829f);
                        recogQBarOfImageFileResultEvent.f265015d.f265019d.add(aVar3.f56828e);
                        recogQBarOfImageFileResultEvent.f265015d.f265021f.add(Integer.valueOf(aVar3.f56832i));
                        recogQBarOfImageFileResultEvent.f265015d.f265018c.add(Integer.valueOf(C5177x.m5204a(aVar3.f56828e)));
                    }
                    List list2 = this.f273188g;
                    if (list2 != null && !list2.isEmpty()) {
                        for (WxQbarNative.QBarReportMsg qBarReportMsg : this.f273188g) {
                            recogQBarOfImageFileResultEvent.f265015d.f265020e.add(Integer.valueOf(qBarReportMsg.qrcodeVersion));
                        }
                    }
                    List list3 = this.f273189h;
                    if (list3 != null && !list3.isEmpty()) {
                        for (QbarNative.QBarPoint qBarPoint : this.f273189h) {
                            if (qBarPoint != null) {
                                float max = Math.max(0.0f, (((qBarPoint.f56815x0 + qBarPoint.f56816x1) + qBarPoint.f56817x2) + qBarPoint.f56818x3) / 4.0f);
                                float max2 = Math.max(0.0f, (((qBarPoint.f56819y0 + qBarPoint.f56820y1) + qBarPoint.f56821y2) + qBarPoint.f56822y3) / 4.0f);
                                recogQBarOfImageFileResultEvent.f265015d.f265024i.add(Float.valueOf(max));
                                recogQBarOfImageFileResultEvent.f265015d.f265025j.add(Float.valueOf(max2));
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.RecogQBarOfImageFileListener", "mFileScanCallback result:%d codeName:%d codeType:%d codeVersion:$d codePointCenterX:%d codePointCenterY:%d", Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265017b.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265019d.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265018c.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265020e.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265024i.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265025j.size()));
                    recogQBarOfImageFileResultEvent.publish();
                    ((HashMap) C94477c0.this.f273182d).remove(Long.valueOf(this.f273186e));
                }
            }
        }

        public C94478a() {
        }

        /* renamed from: a */
        public void mo24342a(long j, C99712h0.C99715c cVar) {
            List<WxQbarNative.QBarReportMsg> list = null;
            List<C19931a.C19932a> list2 = cVar != null ? cVar.f292251a : null;
            List<QbarNative.QBarPoint> list3 = cVar != null ? cVar.f292252b : null;
            if (cVar != null) {
                list = cVar.f292253c;
            }
            MMHandlerThread.postToMainThread(new C94479a(list2, j, cVar, list, list3));
        }
    }

    public boolean callback(IEvent iEvent) {
        if (iEvent instanceof RecogQBarOfImageFileEvent) {
            mo129950d(iEvent);
            return false;
        }
        if (iEvent instanceof CancelRecogImageFileEvent) {
            mo129950d(iEvent);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo129950d(IEvent iEvent) {
        if (iEvent == null) {
            return false;
        }
        if (iEvent instanceof RecogQBarOfImageFileEvent) {
            C19933b.f56834I.mo27310c();
            C19933b.f56834I.mo27313f(2);
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = (RecogQBarOfImageFileEvent) iEvent;
            ((HashMap) this.f273182d).put(Long.valueOf(recogQBarOfImageFileEvent.f107731d.f107732a), recogQBarOfImageFileEvent.f107731d.f107733b);
            C99712h0.C99714b bVar = new C99712h0.C99714b();
            RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
            bVar.f292249a = aVar.f107736e;
            bVar.f292250b = aVar.f107737f;
            C19934c cVar = C19934c.f56868h;
            Context context = MMApplicationContext.getContext();
            RecogQBarOfImageFileEvent.C40158a aVar2 = recogQBarOfImageFileEvent.f107731d;
            cVar.mo27314a(context, aVar2.f107732a, aVar2.f107733b, aVar2.f107734c, this.f273183e, new int[]{0}, bVar);
        } else if (iEvent instanceof CancelRecogImageFileEvent) {
            C19933b.f56834I.mo27309b();
            CancelRecogImageFileEvent cancelRecogImageFileEvent = (CancelRecogImageFileEvent) iEvent;
            C98797b bVar2 = C98797b.f289645f;
            long j = cancelRecogImageFileEvent.f107390d.f107391a;
            synchronized (bVar2.f289649d) {
                if (((HashMap) bVar2.f289646a).containsKey(Long.valueOf(j))) {
                    String str = (String) ((HashMap) bVar2.f289646a).get(Long.valueOf(j));
                    if (((HashMap) bVar2.f289648c).containsKey(str)) {
                        ((List) ((HashMap) bVar2.f289648c).get(str)).remove(Long.valueOf(j));
                        if (((List) ((HashMap) bVar2.f289648c).get(str)).isEmpty()) {
                            ((HashMap) bVar2.f289648c).remove(str);
                        }
                    }
                    ((HashMap) bVar2.f289646a).remove(Long.valueOf(j));
                    ((HashMap) bVar2.f289647b).remove(Long.valueOf(j));
                }
            }
            ((HashMap) this.f273182d).remove(Long.valueOf(cancelRecogImageFileEvent.f107390d.f107391a));
        }
        return false;
    }
}
