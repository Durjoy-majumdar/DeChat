package com.tencent.p014mm.plugin.appbrand.media.record;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExitMultiTalkRoomEvent;
import com.tencent.p014mm.autogen.events.OperateRecordEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import p182kk.C61104a;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener */
public class AudioRecordVoIPInterruptListener implements C83629j {

    /* renamed from: a */
    public C83628i f244199a;

    /* renamed from: b */
    public CheckInterruptTask f244200b;

    /* renamed from: c */
    public StartInterruptEventListenTask f244201c;

    /* renamed from: d */
    public StopInterruptEventListenTask f244202d;

    /* renamed from: e */
    public boolean f244203e = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask */
    public static class StopInterruptEventListenTask extends MainProcessTask {
        public static final Parcelable.Creator<StopInterruptEventListenTask> CREATOR = new C83620a();

        /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StopInterruptEventListenTask$a */
        public class C83620a implements Parcelable.Creator<StopInterruptEventListenTask> {
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
            Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "removeListener");
            C83621a a = C83621a.m102663a();
            a.getClass();
            synchronized (C83621a.class) {
                Iterator<IListener<IEvent>> it = a.f244212a.iterator();
                while (it.hasNext()) {
                    it.next().dead();
                }
                a.f244212a.clear();
            }
        }

        public StopInterruptEventListenTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$a */
    public static class C83621a {

        /* renamed from: b */
        public static C83621a f244211b;

        /* renamed from: a */
        public LinkedList<IListener<IEvent>> f244212a = new LinkedList<>();

        /* renamed from: a */
        public static C83621a m102663a() {
            if (f244211b == null) {
                synchronized (C83621a.class) {
                    if (f244211b == null) {
                        f244211b = new C83621a();
                    }
                }
            }
            return f244211b;
        }
    }

    /* renamed from: a */
    public boolean mo115931a() {
        C83628i iVar = this.f244199a;
        if (iVar == null) {
            Log.m105920e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
            return false;
        }
        if (this.f244200b == null) {
            this.f244200b = new CheckInterruptTask(iVar);
        }
        this.f244200b.mo114396f();
        Log.m105925i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isInterrupted:%b", Boolean.valueOf(this.f244200b.f244204f));
        return this.f244200b.f244204f;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$CheckInterruptTask */
    public static class CheckInterruptTask extends MainProcessTask {
        public static final Parcelable.Creator<CheckInterruptTask> CREATOR = new C83616a();

        /* renamed from: f */
        public boolean f244204f = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$CheckInterruptTask$a */
        public class C83616a implements Parcelable.Creator<CheckInterruptTask> {
            public Object createFromParcel(Parcel parcel) {
                return new CheckInterruptTask(parcel);
            }

            public Object[] newArray(int i) {
                return new CheckInterruptTask[i];
            }
        }

        public CheckInterruptTask(C83628i iVar) {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f244204f = z;
        }

        /* renamed from: j */
        public void mo1553j() {
            boolean z = false;
            this.f244204f = false;
            VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
            voipCheckIsDeviceUsingEvent.publish();
            boolean z2 = voipCheckIsDeviceUsingEvent.f194014d.f194017c;
            boolean D = C61104a.m71644D();
            Log.m105925i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isVoipUsing:%b, isMultiTalkUsing:%b, isAppBrandVoiceUsing:%b", Boolean.valueOf(z2), Boolean.valueOf(D), Boolean.valueOf(C61104a.m71648d()));
            if (z2 || D) {
                z = true;
            }
            this.f244204f = z;
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f244204f ? 1 : 0);
        }

        public CheckInterruptTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask */
    public static class StartInterruptEventListenTask extends MainProcessTask {
        public static final Parcelable.Creator<StartInterruptEventListenTask> CREATOR = new C83619a();

        /* renamed from: f */
        public int f244205f = -1;

        /* renamed from: g */
        public C83628i f244206g;

        /* renamed from: h */
        public final IListener f244207h;

        /* renamed from: i */
        public final IListener f244208i;

        /* renamed from: com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener$StartInterruptEventListenTask$a */
        public class C83619a implements Parcelable.Creator<StartInterruptEventListenTask> {
            public Object createFromParcel(Parcel parcel) {
                return new StartInterruptEventListenTask(parcel);
            }

            public Object[] newArray(int i) {
                return new StartInterruptEventListenTask[i];
            }
        }

        public StartInterruptEventListenTask(C83628i iVar) {
            C40008f fVar = C40008f.f107254d;
            this.f244207h = new IListener<ExitMultiTalkRoomEvent>(fVar) {
                {
                    this.__eventId = -2057571736;
                }

                public boolean callback(IEvent iEvent) {
                    ExitMultiTalkRoomEvent exitMultiTalkRoomEvent = (ExitMultiTalkRoomEvent) iEvent;
                    StartInterruptEventListenTask.this.mo114394b();
                    Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                    return false;
                }
            };
            this.f244208i = new IListener<VoipEvent>(fVar) {
                {
                    this.__eventId = -797557590;
                }

                public boolean callback(IEvent iEvent) {
                    int i = ((VoipEvent) iEvent).f194019d.f194022b;
                    if (i == 11) {
                        Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                        StartInterruptEventListenTask startInterruptEventListenTask = StartInterruptEventListenTask.this;
                        startInterruptEventListenTask.f244205f = 11;
                        startInterruptEventListenTask.mo114394b();
                        return true;
                    } else if (i != 3) {
                        return false;
                    } else {
                        Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                        StartInterruptEventListenTask startInterruptEventListenTask2 = StartInterruptEventListenTask.this;
                        startInterruptEventListenTask2.f244205f = 3;
                        startInterruptEventListenTask2.mo114394b();
                        return true;
                    }
                }
            };
            this.f244206g = iVar;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f244205f = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f244206g != null) {
                int i = this.f244205f;
                if (i == 11) {
                    Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptEnd");
                    C83631l lVar = C83631l.this;
                    if (lVar.f244238q) {
                        lVar.f244238q = false;
                        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "onInterruptionEnd");
                        OperateRecordEvent operateRecordEvent = new OperateRecordEvent();
                        OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
                        aVar.f236249a = 7;
                        aVar.f236251c = "interruptionEnd";
                        RecordParam recordParam = lVar.f244225d;
                        if (recordParam != null) {
                            aVar.f236258j = recordParam.f244270p;
                        }
                        operateRecordEvent.asyncPublish(Looper.getMainLooper());
                    } else {
                        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "not call onInterruptionEnd");
                    }
                } else if (i == 3) {
                    Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptBegin");
                    C83631l lVar2 = C83631l.this;
                    if (!lVar2.f244238q) {
                        lVar2.mo115945i();
                    } else {
                        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "is interrupting");
                    }
                }
                this.f244205f = -1;
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Class<C83621a> cls = C83621a.class;
            Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "addListener");
            if (!EventCenter.instance.hadListened(this.f244207h)) {
                this.f244207h.alive();
                C83621a a = C83621a.m102663a();
                IListener iListener = this.f244207h;
                a.getClass();
                synchronized (cls) {
                    C83621a.m102663a().f244212a.add(iListener);
                }
            }
            if (!EventCenter.instance.hadListened(this.f244208i)) {
                this.f244208i.alive();
                C83621a a2 = C83621a.m102663a();
                IListener iListener2 = this.f244208i;
                a2.getClass();
                synchronized (cls) {
                    C83621a.m102663a().f244212a.add(iListener2);
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f244205f);
        }

        public StartInterruptEventListenTask(Parcel parcel) {
            C40008f fVar = C40008f.f107254d;
            this.f244207h = new IListener<ExitMultiTalkRoomEvent>(fVar) {
                {
                    this.__eventId = -2057571736;
                }

                public boolean callback(IEvent iEvent) {
                    ExitMultiTalkRoomEvent exitMultiTalkRoomEvent = (ExitMultiTalkRoomEvent) iEvent;
                    StartInterruptEventListenTask.this.mo114394b();
                    Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "exit multi talk room event");
                    return false;
                }
            };
            this.f244208i = new IListener<VoipEvent>(fVar) {
                {
                    this.__eventId = -797557590;
                }

                public boolean callback(IEvent iEvent) {
                    int i = ((VoipEvent) iEvent).f194019d.f194022b;
                    if (i == 11) {
                        Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "stop voIP event");
                        StartInterruptEventListenTask startInterruptEventListenTask = StartInterruptEventListenTask.this;
                        startInterruptEventListenTask.f244205f = 11;
                        startInterruptEventListenTask.mo114394b();
                        return true;
                    } else if (i != 3) {
                        return false;
                    } else {
                        Log.m105924i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "start invite voIP event");
                        StartInterruptEventListenTask startInterruptEventListenTask2 = StartInterruptEventListenTask.this;
                        startInterruptEventListenTask2.f244205f = 3;
                        startInterruptEventListenTask2.mo114394b();
                        return true;
                    }
                }
            };
            this.f244205f = parcel.readInt();
        }
    }
}
