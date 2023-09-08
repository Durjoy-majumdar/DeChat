package uw2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kd0.C76539f;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;

/* renamed from: uw2.l */
public class C78302l implements C11385n {

    /* renamed from: q */
    public static int f229364q;

    /* renamed from: d */
    public Queue<String> f229365d = new LinkedList();

    /* renamed from: e */
    public Queue<String> f229366e = new LinkedList();

    /* renamed from: f */
    public Map<String, C76861g.C47263a> f229367f = new HashMap();

    /* renamed from: g */
    public boolean f229368g = false;

    /* renamed from: h */
    public boolean f229369h = false;

    /* renamed from: i */
    public boolean f229370i = false;

    /* renamed from: j */
    public int f229371j = 0;

    /* renamed from: n */
    public long f229372n = 0;

    /* renamed from: o */
    public C76861g.C47263a f229373o = new C76861g.C47263a();

    /* renamed from: p */
    public MTimerHandler f229374p = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C78305c(), false);

    /* renamed from: uw2.l$a */
    public class C78303a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f229375d;

        /* renamed from: e */
        public final /* synthetic */ int f229376e;

        /* renamed from: f */
        public final /* synthetic */ int f229377f;

        public C78303a(C117747y yVar, int i, int i2) {
            this.f229375d = yVar;
            this.f229376e = i;
            this.f229377f = i2;
        }

        public void run() {
            String str;
            int i;
            C78302l.f229364q++;
            if (this.f229375d.getType() == 128) {
                C78302l.this.f229368g = false;
                C76539f fVar = (C76539f) this.f229375d;
                str = fVar.f223996f;
                i = fVar.f223999i;
            } else if (this.f229375d.getType() == 329) {
                C78302l.this.f229369h = false;
                C78287c cVar = (C78287c) this.f229375d;
                str = cVar.f229320f;
                i = cVar.f229322h;
            } else {
                Log.m105920e("MicroMsg.VoiceRemindService", "onSceneEnd Error SceneType:" + this.f229375d.getType());
                C78302l.f229364q = C78302l.f229364q + -1;
                return;
            }
            long j = 0;
            if (!(str == null || ((HashMap) C78302l.this.f229367f).get(str) == null)) {
                j = ((C76861g.C47263a) ((HashMap) C78302l.this.f229367f).get(str)).mo72288a();
                ((HashMap) C78302l.this.f229367f).remove(str);
            }
            Log.m105918d("MicroMsg.VoiceRemindService", "onSceneEnd SceneType:" + this.f229375d.getType() + " errtype:" + this.f229376e + " errCode:" + this.f229377f + " retCode:" + i + " file:" + str + " time:" + j);
            int i2 = this.f229376e;
            if (i2 == 3 && i != 0) {
                C78302l lVar = C78302l.this;
                lVar.f229371j--;
            } else if (i2 != 0) {
                C78302l.this.f229371j = 0;
            }
            Log.m105918d("MicroMsg.VoiceRemindService", "onSceneEnd  inCnt:" + C78302l.f229364q + " stop:" + C78302l.this.f229371j + " running:" + C78302l.this.f229370i + " recving:" + C78302l.this.f229368g + " sending:" + C78302l.this.f229369h);
            C78302l lVar2 = C78302l.this;
            if (lVar2.f229371j > 0) {
                C78302l.m94599a(lVar2);
            } else if (!lVar2.f229369h && !lVar2.f229368g) {
                lVar2.mo108315b();
            }
            C78302l.f229364q--;
        }
    }

    /* renamed from: uw2.l$b */
    public class C78304b implements Runnable {
        public C78304b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis() - C78302l.this.f229372n;
            Log.m105918d("MicroMsg.VoiceRemindService", "Try Run service runningFlag:" + C78302l.this.f229370i + " timeWait:" + currentTimeMillis + " sending:" + C78302l.this.f229369h + " recving:" + C78302l.this.f229368g);
            if (C78302l.this.f229370i) {
                if (currentTimeMillis >= 60000) {
                    Log.m105920e("MicroMsg.VoiceRemindService", "ERR: Try Run service runningFlag:" + C78302l.this.f229370i + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + C78302l.this.f229369h + " recving:" + C78302l.this.f229368g);
                } else {
                    return;
                }
            }
            C78302l lVar = C78302l.this;
            lVar.f229370i = true;
            lVar.f229369h = false;
            lVar.f229371j = 3;
            lVar.f229368g = false;
            lVar.f229373o.mo72289b();
            C78302l.this.f229374p.startTimer(10);
        }
    }

    /* renamed from: uw2.l$c */
    public class C78305c implements MTimerHandler.CallBack {
        public C78305c() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.VoiceRemindService", "onTimerExpired");
            try {
                C78302l.m94599a(C78302l.this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoiceRemindService", e, "", new Object[0]);
            }
            return false;
        }
    }

    public C78302l() {
        C97625j3.m125815e().mo123455a(329, this);
    }

    /* renamed from: a */
    public static void m94599a(C78302l lVar) {
        int i;
        ArrayList arrayList;
        Object obj;
        int i2;
        C78302l lVar2 = lVar;
        lVar.getClass();
        lVar2.f229372n = System.currentTimeMillis();
        if ((!lVar2.f229368g && ((LinkedList) lVar2.f229366e).size() == 0) || (!lVar2.f229369h && ((LinkedList) lVar2.f229365d).size() == 0)) {
            C78306m xx02 = C78291e.xx0();
            xx02.getClass();
            Cursor rawQuery = xx02.f229383d.rawQuery("SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2 FROM VoiceRemindInfo WHERE status<97  order by createtime", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                arrayList = new ArrayList();
                i = 0;
                do {
                    C78295i iVar = new C78295i();
                    iVar.convertFrom(rawQuery);
                    arrayList.add(iVar);
                    i++;
                } while (rawQuery.moveToNext());
            } else {
                arrayList = null;
                i = 0;
            }
            rawQuery.close();
            Log.m105918d("MicroMsg.VoiceRemindStorage", "getUnfinishInfo resCount:" + i);
            if (arrayList == null) {
                Log.m105918d("MicroMsg.VoiceRemindService", "getNeedRunInfo null ");
            } else {
                Log.m105918d("MicroMsg.VoiceRemindService", "getNeedRunInfo " + arrayList.size());
            }
            if (!(arrayList == null || arrayList.size() == 0)) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String formatUnixTime = Util.formatUnixTime(currentTimeMillis);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C78295i iVar2 = (C78295i) it.next();
                    if (((HashMap) lVar2.f229367f).containsKey(iVar2.field_filename)) {
                        Log.m105918d("MicroMsg.VoiceRemindService", "File is Already running:" + iVar2.field_filename);
                    } else {
                        Log.m105918d("MicroMsg.VoiceRemindService", "Get file:" + iVar2.field_filename + " status:" + iVar2.field_status + " user" + iVar2.field_user + " human:" + iVar2.field_human + " create:" + Util.formatUnixTime(iVar2.field_createtime) + " last:" + Util.formatUnixTime(iVar2.field_lastmodifytime) + " now:" + Util.formatUnixTime(currentTimeMillis) + " " + (currentTimeMillis - iVar2.field_lastmodifytime));
                        int i3 = iVar2.field_status;
                        Iterator it4 = it;
                        if (i3 == 5 || i3 == 6) {
                            long j = currentTimeMillis - iVar2.field_lastmodifytime;
                            if (j > 80 && i3 == 5) {
                                Log.m105920e("MicroMsg.VoiceRemindService", "time out file: " + iVar2.field_filename + " last:" + Util.formatUnixTime(iVar2.field_lastmodifytime) + " now:" + formatUnixTime);
                                C78296j.m94587e(iVar2.field_filename);
                                obj = null;
                                Object obj2 = obj;
                                it = it4;
                            } else if (j > 300 && i3 == 6) {
                                Log.m105920e("MicroMsg.VoiceRemindService", "time out file: " + iVar2.field_filename + " last:" + Util.formatUnixTime(iVar2.field_lastmodifytime) + " now:" + formatUnixTime);
                                C78296j.m94587e(iVar2.field_filename);
                                obj = null;
                                Object obj22 = obj;
                                it = it4;
                            } else if (iVar2.field_filenowsize >= iVar2.field_offset) {
                                Log.m105918d("MicroMsg.VoiceRemindService", "file: " + iVar2.field_filename + " stat:" + iVar2.field_status + " now:" + iVar2.field_filenowsize + " net:" + iVar2.field_offset);
                                obj = null;
                                Object obj222 = obj;
                                it = it4;
                            } else {
                                ((LinkedList) lVar2.f229366e).offer(iVar2.field_filename);
                                ((HashMap) lVar2.f229367f).put(iVar2.field_filename, (Object) null);
                            }
                        }
                        int i4 = iVar2.field_status;
                        if ((i4 > 1 && i4 <= 3) || i4 == 8) {
                            Log.m105918d("MicroMsg.VoiceRemindService", "now " + currentTimeMillis + "info.getLastModifyTime()  " + iVar2.field_lastmodifytime + "  info.getStatus() " + iVar2.field_status + "  info.getCreateTime() " + iVar2.field_createtime);
                            if (currentTimeMillis - iVar2.field_lastmodifytime > 10 && ((i2 = iVar2.field_status) == 2 || i2 == 1)) {
                                Log.m105920e("MicroMsg.VoiceRemindService", "time out file: " + iVar2.field_filename + " last:" + Util.formatUnixTime(iVar2.field_lastmodifytime) + " now:" + formatUnixTime);
                                C78296j.m94587e(iVar2.field_filename);
                            } else if (currentTimeMillis - iVar2.field_createtime > 600 && iVar2.field_status == 3) {
                                Log.m105920e("MicroMsg.VoiceRemindService", "time out file: " + iVar2.field_filename + " last:" + Util.formatUnixTime(iVar2.field_lastmodifytime) + " now:" + formatUnixTime);
                                C78296j.m94587e(iVar2.field_filename);
                            } else if (iVar2.field_user.length() <= 0) {
                                Log.m105920e("MicroMsg.VoiceRemindService", "Create a new ChatRoom? , set username first :" + iVar2.field_filename);
                            } else {
                                ((LinkedList) lVar2.f229365d).offer(iVar2.field_filename);
                                obj = null;
                                ((HashMap) lVar2.f229367f).put(iVar2.field_filename, (Object) null);
                                Object obj2222 = obj;
                                it = it4;
                            }
                        }
                        obj = null;
                        Object obj22222 = obj;
                        it = it4;
                    }
                }
                Log.m105918d("MicroMsg.VoiceRemindService", "GetNeedRun procing:" + ((HashMap) lVar2.f229367f).size() + " [recv:" + ((LinkedList) lVar2.f229366e).size() + ",send:" + ((LinkedList) lVar2.f229365d).size() + "]");
                ((LinkedList) lVar2.f229366e).size();
                ((LinkedList) lVar2.f229365d).size();
            }
        }
        if (lVar2.f229368g || ((LinkedList) lVar2.f229366e).size() != 0 || lVar2.f229369h || ((LinkedList) lVar2.f229365d).size() != 0) {
            if (!lVar2.f229368g && ((LinkedList) lVar2.f229366e).size() > 0) {
                String str = (String) ((LinkedList) lVar2.f229366e).poll();
                Log.m105918d("MicroMsg.VoiceRemindService", "Start Recv :" + str);
                if (str != null) {
                    ((HashMap) lVar2.f229367f).put(str, new C76861g.C47263a());
                    lVar2.f229368g = true;
                    Log.m105918d("MicroMsg.VoiceRemindService", "tiger download voice");
                }
            }
            if (!lVar2.f229369h && ((LinkedList) lVar2.f229365d).size() > 0) {
                String str2 = (String) ((LinkedList) lVar2.f229365d).poll();
                Log.m105918d("MicroMsg.VoiceRemindService", "Start Send :" + str2);
                if (str2 != null) {
                    ((HashMap) lVar2.f229367f).put(str2, new C76861g.C47263a());
                    lVar2.f229369h = true;
                    C97625j3.m125815e().mo123460f(new C78287c(str2));
                    return;
                }
                return;
            }
            return;
        }
        lVar.mo108315b();
        Log.m105918d("MicroMsg.VoiceRemindService", "No Data Any More , Stop Service");
    }

    /* renamed from: b */
    public final void mo108315b() {
        ((HashMap) this.f229367f).clear();
        ((LinkedList) this.f229365d).clear();
        ((LinkedList) this.f229366e).clear();
        this.f229369h = false;
        this.f229368g = false;
        this.f229370i = false;
        Log.m105918d("MicroMsg.VoiceRemindService", "Finish service use time(ms):" + this.f229373o.mo72288a());
    }

    /* renamed from: c */
    public void mo108316c() {
        C86709a0.m107525e().postToWorker(new C78304b());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107525e().postToWorker(new C78303a(yVar, i, i2));
    }
}
