package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import p576jp.C33612d;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener */
public class OpenVoiceVoIPInterruptListener implements C33612d {

    /* renamed from: a */
    public C33612d.C33613a f248093a;

    /* renamed from: b */
    public StartInterruptEventListenTask f248094b;

    /* renamed from: c */
    public StopInterruptEventListenTask f248095c;

    /* renamed from: d */
    public boolean f248096d = false;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask */
    public static class StopInterruptEventListenTask extends MainProcessTask {
        public static final Parcelable.Creator<StopInterruptEventListenTask> CREATOR = new C85145a();

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StopInterruptEventListenTask$a */
        public class C85145a implements Parcelable.Creator<StopInterruptEventListenTask> {
            public Object createFromParcel(Parcel parcel) {
                return new StopInterruptEventListenTask(parcel);
            }

            public Object[] newArray(int i) {
                return new StopInterruptEventListenTask[i];
            }
        }

        public StopInterruptEventListenTask() {
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "removeListener");
            C85146a a = C85146a.m105009a();
            a.getClass();
            synchronized (C85146a.class) {
                Iterator<IListener<IEvent>> it = a.f248102a.iterator();
                while (it.hasNext()) {
                    it.next().dead();
                }
                a.f248102a.clear();
            }
        }

        public StopInterruptEventListenTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$a */
    public static class C85146a {

        /* renamed from: b */
        public static C85146a f248101b;

        /* renamed from: a */
        public LinkedList<IListener<IEvent>> f248102a = new LinkedList<>();

        /* renamed from: a */
        public static C85146a m105009a() {
            if (f248101b == null) {
                synchronized (C85146a.class) {
                    if (f248101b == null) {
                        f248101b = new C85146a();
                    }
                }
            }
            return f248101b;
        }
    }

    /* renamed from: a */
    public void mo118163a() {
        C33612d.C33613a aVar = this.f248093a;
        if (aVar == null) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "callback is invalid");
            return;
        }
        if (this.f248094b == null) {
            this.f248094b = new StartInterruptEventListenTask(aVar);
        }
        this.f248096d = true;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "startListenInterruptEvent");
        this.f248094b.mo114395c();
    }

    /* renamed from: b */
    public void mo118164b() {
        if (!this.f248096d) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "not start listen");
            return;
        }
        this.f248096d = false;
        if (this.f248095c == null) {
            this.f248095c = new StopInterruptEventListenTask();
        }
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stopListenInterruptEvent");
        this.f248095c.mo114396f();
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask */
    public static class StartInterruptEventListenTask extends MainProcessTask {
        public static final Parcelable.Creator<StartInterruptEventListenTask> CREATOR = new C85144a();

        /* renamed from: f */
        public int f248097f = -1;

        /* renamed from: g */
        public C33612d.C33613a f248098g;

        /* renamed from: h */
        public final IListener f248099h = new IListener<VoipEvent>(C40008f.f107254d) {
            {
                this.__eventId = -797557590;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((VoipEvent) iEvent).f194019d.f194022b;
                if (i == 11) {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "stop voIP event");
                    StartInterruptEventListenTask startInterruptEventListenTask = StartInterruptEventListenTask.this;
                    startInterruptEventListenTask.f248097f = 11;
                    startInterruptEventListenTask.mo114394b();
                    return false;
                } else if (i != 3) {
                    return false;
                } else {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "start invite voIP event");
                    StartInterruptEventListenTask startInterruptEventListenTask2 = StartInterruptEventListenTask.this;
                    startInterruptEventListenTask2.f248097f = 3;
                    startInterruptEventListenTask2.mo114394b();
                    return false;
                }
            }
        };

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener$StartInterruptEventListenTask$a */
        public class C85144a implements Parcelable.Creator<StartInterruptEventListenTask> {
            public Object createFromParcel(Parcel parcel) {
                return new StartInterruptEventListenTask(parcel);
            }

            public Object[] newArray(int i) {
                return new StartInterruptEventListenTask[i];
            }
        }

        public StartInterruptEventListenTask(C33612d.C33613a aVar) {
            this.f248098g = aVar;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f248097f = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f248098g != null) {
                int i = this.f248097f;
                if (i == 11) {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptEnd");
                    this.f248098g.mo56934b();
                } else if (i == 3) {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "onInterruptBegin");
                    this.f248098g.mo56933a();
                }
                this.f248097f = -1;
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVoIPInterruptListener", "addListener");
            if (!EventCenter.instance.hadListened(this.f248099h)) {
                this.f248099h.alive();
                C85146a a = C85146a.m105009a();
                IListener iListener = this.f248099h;
                a.getClass();
                synchronized (C85146a.class) {
                    C85146a.m105009a().f248102a.add(iListener);
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f248097f);
        }

        public StartInterruptEventListenTask(Parcel parcel) {
            this.f248097f = parcel.readInt();
        }
    }
}
