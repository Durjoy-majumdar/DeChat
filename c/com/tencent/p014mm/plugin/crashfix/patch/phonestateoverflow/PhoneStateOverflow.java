package com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import c31.C79925c;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TelePmEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p757xv.C91353u;

/* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow */
public class PhoneStateOverflow implements C79925c {

    /* renamed from: a */
    public List<C115375c> f345774a = new ArrayList();

    /* renamed from: b */
    public List<C115373a> f345775b = new ArrayList();

    /* renamed from: c */
    public Handler f345776c = new Handler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$a */
    public class C115373a {

        /* renamed from: a */
        public int f345778a;

        /* renamed from: b */
        public PhoneStateListener f345779b;

        public C115373a(PhoneStateOverflow phoneStateOverflow, C1153721 r2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$c */
    public class C115375c {

        /* renamed from: a */
        public int f345782a;

        /* renamed from: b */
        public WeakReference<PhoneStateListener> f345783b;

        public C115375c(PhoneStateOverflow phoneStateOverflow, C1153721 r2) {
        }
    }

    /* renamed from: a */
    public boolean mo58760a(int i) {
        return i >= 30 && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_r_phonestate_overflow, 1) == 1;
    }

    /* renamed from: d */
    public boolean mo58763d() {
        new IListener<TelePmEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1377550179;
            }

            public boolean callback(IEvent iEvent) {
                TelePmEvent.C114697a aVar = ((TelePmEvent) iEvent).f343626d;
                if (aVar.f343629c == 0) {
                    PhoneStateListener phoneStateListener = aVar.f343627a;
                    int i = aVar.f343628b;
                    if (phoneStateListener instanceof C115374b) {
                        Log.m105924i("MicroMsg.PhoneStateOverflow", "InnerPhoneStateListener come");
                    } else {
                        Log.m105925i("MicroMsg.PhoneStateOverflow", "event id = %d, listener %d", Integer.valueOf(i), Integer.valueOf(phoneStateListener.hashCode()));
                        if (i == 0) {
                            PhoneStateOverflow phoneStateOverflow = PhoneStateOverflow.this;
                            synchronized (phoneStateOverflow) {
                                Iterator it = ((ArrayList) phoneStateOverflow.f345774a).iterator();
                                while (it.hasNext()) {
                                    C115375c cVar = (C115375c) it.next();
                                    PhoneStateListener phoneStateListener2 = cVar.f345783b.get();
                                    if (phoneStateListener2 == null) {
                                        it.remove();
                                    } else if (phoneStateListener2 == phoneStateListener) {
                                        it.remove();
                                        Log.m105925i("MicroMsg.PhoneStateOverflow", "remove outter %d", Integer.valueOf(cVar.f345782a));
                                    }
                                }
                            }
                        } else {
                            new WeakReference(phoneStateListener);
                            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                            String str = "";
                            if (stackTrace != null) {
                                for (int i2 = 0; i2 < stackTrace.length; i2++) {
                                    str = str + stackTrace[i2].getClassName() + " " + stackTrace[i2].getMethodName() + XVFSFile.PATH_SEPARATOR + stackTrace[i2].getLineNumber() + "\n";
                                }
                            }
                            PhoneStateOverflow.this.f345776c.post(new C115376a(this, i, phoneStateListener, str));
                        }
                    }
                }
                return false;
            }
        }.alive();
        return true;
    }

    /* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$b */
    public class C115374b extends PhoneStateListener {

        /* renamed from: a */
        public C115373a f345780a;

        public C115374b(C115373a aVar) {
            this.f345780a = aVar;
        }

        public void onCallForwardingIndicatorChanged(boolean z) {
            super.onCallForwardingIndicatorChanged(z);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onCallForwardingIndicatorChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onCallForwardingIndicatorChanged(z);
                        }
                    }
                }
            }
        }

        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onCallStateChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onCallStateChanged(i, str);
                        }
                    }
                }
            }
        }

        public void onCellInfoChanged(List<CellInfo> list) {
            super.onCellInfoChanged(list);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onCellInfoChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onCellInfoChanged(list);
                        }
                    }
                }
            }
        }

        public void onCellLocationChanged(CellLocation cellLocation) {
            super.onCellLocationChanged(cellLocation);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onCellLocationChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onCellLocationChanged(cellLocation);
                        }
                    }
                }
            }
        }

        public void onDataActivity(int i) {
            super.onDataActivity(i);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onDataActivity %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onDataActivity(i);
                        }
                    }
                }
            }
        }

        public void onDataConnectionStateChanged(int i) {
            super.onDataConnectionStateChanged(i);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onDataConnectionStateChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onDataConnectionStateChanged(i);
                        }
                    }
                }
            }
        }

        public void onMessageWaitingIndicatorChanged(boolean z) {
            super.onMessageWaitingIndicatorChanged(z);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onMessageWaitingIndicatorChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onMessageWaitingIndicatorChanged(z);
                        }
                    }
                }
            }
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            super.onServiceStateChanged(serviceState);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onServiceStateChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onServiceStateChanged(serviceState);
                        }
                    }
                }
            }
        }

        public void onSignalStrengthChanged(int i) {
            super.onSignalStrengthChanged(i);
            Log.m105920e("MicroMsg.PhoneStateOverflow", "onSignalStrengthChanged call!, val = " + i);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onSignalStrengthChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onSignalStrengthChanged(i);
                        }
                    }
                }
            }
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            StringBuilder sb = new StringBuilder();
            sb.append("onSignalStrengthsChanged call!, val = ");
            sb.append(((C91353u) C86312j.m106911c(C91353u.class)).mo112624Fp() ? signalStrength.toString() : "\\");
            Log.m105920e("MicroMsg.PhoneStateOverflow", sb.toString());
            if (Build.VERSION.SDK_INT >= 29) {
                List<CellSignalStrength> cellSignalStrengths = signalStrength.getCellSignalStrengths();
                HashMap hashMap = new HashMap(cellSignalStrengths.size());
                for (CellSignalStrength next : cellSignalStrengths) {
                    hashMap.put(next.getClass(), next);
                }
                CellSignalStrength cellSignalStrength = (CellSignalStrength) hashMap.get(CellSignalStrengthCdma.class);
                CellSignalStrength cellSignalStrength2 = (CellSignalStrength) hashMap.get(CellSignalStrengthGsm.class);
                CellSignalStrength cellSignalStrength3 = (CellSignalStrength) hashMap.get(CellSignalStrengthWcdma.class);
                CellSignalStrength cellSignalStrength4 = (CellSignalStrength) hashMap.get(CellSignalStrengthTdscdma.class);
                CellSignalStrength cellSignalStrength5 = (CellSignalStrength) hashMap.get(CellSignalStrengthLte.class);
                CellSignalStrength cellSignalStrength6 = (CellSignalStrength) hashMap.get(CellSignalStrengthNr.class);
                ArrayList arrayList = new ArrayList(6);
                arrayList.add(Integer.valueOf(cellSignalStrength == null ? 0 : cellSignalStrength.getLevel()));
                arrayList.add(Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getLevel()));
                arrayList.add(Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getLevel()));
                arrayList.add(Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getLevel()));
                arrayList.add(Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getLevel()));
                arrayList.add(Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getLevel()));
                Log.m105924i("MicroMsg.PhoneStateOverflow", "signalStrength: " + arrayList);
                ArrayList arrayList2 = new ArrayList(6);
                arrayList2.add(Integer.valueOf(cellSignalStrength == null ? 0 : cellSignalStrength.getAsuLevel()));
                arrayList2.add(Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getAsuLevel()));
                arrayList2.add(Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getAsuLevel()));
                arrayList2.add(Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getAsuLevel()));
                arrayList2.add(Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getAsuLevel()));
                arrayList2.add(Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getAsuLevel()));
                Log.m105924i("MicroMsg.PhoneStateOverflow", "signalAsuLevel: " + arrayList2);
                ArrayList arrayList3 = new ArrayList(6);
                arrayList3.add(Integer.valueOf(cellSignalStrength == null ? 0 : cellSignalStrength.getDbm()));
                arrayList3.add(Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getDbm()));
                arrayList3.add(Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getDbm()));
                arrayList3.add(Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getDbm()));
                arrayList3.add(Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getDbm()));
                arrayList3.add(Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getDbm()));
                Log.m105924i("MicroMsg.PhoneStateOverflow", "signalDbm: " + arrayList3);
            }
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onSignalStrengthsChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onSignalStrengthsChanged(signalStrength);
                        }
                    }
                }
            }
        }

        public void onUserMobileDataStateChanged(boolean z) {
            super.onUserMobileDataStateChanged(z);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onUserMobileDataStateChanged %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onUserMobileDataStateChanged(z);
                        }
                    }
                }
            }
        }

        public void onDataConnectionStateChanged(int i, int i2) {
            super.onDataConnectionStateChanged(i, i2);
            synchronized (PhoneStateOverflow.this) {
                Iterator it = ((ArrayList) PhoneStateOverflow.this.f345774a).iterator();
                while (it.hasNext()) {
                    C115375c cVar = (C115375c) it.next();
                    if (cVar.f345782a == this.f345780a.f345778a) {
                        PhoneStateListener phoneStateListener = cVar.f345783b.get();
                        if (phoneStateListener != null) {
                            Log.m105925i("MicroMsg.PhoneStateOverflow", "onDataConnectionStateChanged2 %d %d", Integer.valueOf(this.f345780a.f345778a), Integer.valueOf(phoneStateListener.hashCode()));
                            phoneStateListener.onDataConnectionStateChanged(i, i2);
                        }
                    }
                }
            }
        }
    }
}
