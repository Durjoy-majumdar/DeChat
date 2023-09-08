package o03;

import com.tencent.p014mm.autogen.events.SearchSysMsgNotifyEvent;
import com.tencent.p014mm.plugin.topstory.p113ui.home.C19348d;
import com.tencent.p014mm.plugin.topstory.p113ui.home.C19349e;
import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ky2.C10432i;
import nc0.C76850a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21914h;
import p167hz.C21032k;
import qe3.C89625d;
import sj0.C90210f;
import t03.C22426h;
import te3.rh4;
import u73.C22613h1;
import u73.C78137s0;

/* renamed from: o03.h */
public class C21723h implements C21032k {

    /* renamed from: a */
    public rh4 f61497a;

    /* renamed from: b */
    public rh4 f61498b;

    /* renamed from: c */
    public rh4 f61499c;

    /* renamed from: d */
    public LinkedList<rh4> f61500d = new LinkedList<>();

    /* renamed from: e */
    public C21032k.C21033a f61501e;

    public C21723h() {
        rh4 rh4 = new rh4();
        this.f61498b = rh4;
        mo34015z(rh4);
        rh4 rh42 = this.f61498b;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TOP_STORY_RED_XML_REC_STRING;
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split(",");
            if (split != null) {
                try {
                    if (split.length >= 13) {
                        mo34002m(rh42, split);
                    }
                } catch (Exception unused) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        rh4 rh43 = new rh4();
        this.f61497a = rh43;
        mo34015z(rh43);
        rh4 rh44 = this.f61497a;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING;
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar2, "");
        if (!Util.isNullOrNil(str2)) {
            String[] split2 = str2.split(",");
            if (split2 != null) {
                try {
                    if (split2.length >= 13) {
                        mo34002m(rh44, split2);
                    }
                } catch (Exception unused2) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        rh4 rh45 = new rh4();
        this.f61499c = rh45;
        mo34015z(rh45);
        rh4 rh46 = this.f61499c;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING;
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar3, "");
        if (!Util.isNullOrNil(str3)) {
            String[] split3 = str3.split(",");
            if (split3 != null) {
                try {
                    if (split3.length >= 13) {
                        mo34002m(rh46, split3);
                    }
                } catch (Exception unused3) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar3, "");
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, "");
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_TOP_STORY_CMT_RED_XML_REC_STRING;
        String str4 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar4, "");
        if (!Util.isNullOrNil(str4)) {
            try {
                for (String str5 : str4.split(";")) {
                    if (!Util.isNullOrNil(str5)) {
                        String[] split4 = str5.split(",");
                        rh4 rh47 = new rh4();
                        mo34002m(rh47, split4);
                        this.f61500d.addLast(rh47);
                    }
                }
            } catch (Exception unused4) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar4, "");
                C86709a0.m107535s().mo121142i().mo119681a(true);
            }
        }
    }

    /* renamed from: A */
    public boolean mo33981A() {
        long k = C75592q0.m90781k();
        boolean z = (67108864 & k) == 0;
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean k2 = C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null));
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "isShowRecEntry %s %s %s %s", Long.valueOf(k), Boolean.valueOf(z), Boolean.valueOf(e), Boolean.valueOf(k2));
        return z && !e && !k2;
    }

    /* renamed from: B */
    public final void mo33982B() {
        synchronized (this.f61500d) {
            StringBuilder sb = new StringBuilder();
            Iterator<rh4> it = this.f61500d.iterator();
            while (it.hasNext()) {
                sb.append(mo34003n(it.next()));
                sb.append(";");
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_CMT_RED_XML_REC_STRING, sb.toString());
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    /* renamed from: C */
    public void mo33983C(rh4 rh4) {
        boolean z = false;
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "setHomeTabRedDot %s", rh4.f64533d);
        if (!mo33981A()) {
            C22613h1.m26484j(rh4, 108, 1, 0, 0, "");
        }
        try {
            JSONArray jSONArray = C78137s0.m94340d("topstoryTopTabParam").getJSONArray("tabs");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                } else if (C21914h.m25163k(jSONArray.getJSONObject(i).getInt("category"))) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.TopStory.TopStoryRedDotImpl", "parse topstoryTopTabParam failed: %s", e.getMessage());
        }
        z = true;
        if (z) {
            C22613h1.m26484j(rh4, 109, 1, 0, 0, "no exist home tab");
        }
        this.f61497a = rh4;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING, mo34003n(this.f61497a));
        C86709a0.m107535s().mo121142i().mo119681a(true);
        C22613h1.m26484j(rh4, 101, 3, 0, 0, "");
        C21032k.C21033a aVar = this.f61501e;
        if (aVar != null) {
            ((TopStoryHomeUIComponentImpl.C19327e) aVar).mo24923b(this.f61497a, 100);
        }
        new SearchSysMsgNotifyEvent().publish();
    }

    /* renamed from: D */
    public void mo33984D(String str, String str2, long j) {
        C21032k.C21033a aVar;
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "setUserIconRedDot %s, extInfo %s", str, str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgId", str);
            jSONObject.put("extInfo", str2);
            jSONObject.put("ts", j);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryRedDotImpl", e, "setUserIconRedDot error", new Object[0]);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, jSONObject.toString());
        C86709a0.m107535s().mo121142i().mo119681a(true);
        if (!Util.isNullOrNil(str) && (aVar = this.f61501e) != null) {
            TopStoryHomeUIComponentImpl.C19327e eVar = (TopStoryHomeUIComponentImpl.C19327e) aVar;
            TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19349e(eVar, str, j));
        }
    }

    /* renamed from: E */
    public void mo33985E() {
        if (mo34005p() > 0) {
            rh4 o = mo34004o();
            if (o != null) {
                C22613h1.m26485k(o.f64533d, o.f64541o, 201, 2, mo34005p(), 0, "", o.f64546t);
            }
        } else if (mo33991b() && mo33992c()) {
            rh4 rh4 = this.f61497a;
            int i = rh4.f64548v;
            rh4 rh42 = this.f61498b;
            int i2 = rh42.f64548v;
            if (i > i2) {
                C22613h1.m26485k(rh4.f64533d, rh4.f64541o, 201, 1, 0, 0, "", 0);
            } else if (i < i2) {
                C22613h1.m26485k(rh42.f64533d, rh42.f64541o, 201, 1, 0, 0, "", 0);
            } else {
                long j = rh4.f64544r;
                long j2 = rh42.f64544r;
                if (j > j2) {
                    C22613h1.m26485k(rh4.f64533d, rh4.f64541o, 201, 1, 0, 0, "", 0);
                } else if (j < j2) {
                    C22613h1.m26485k(rh42.f64533d, rh42.f64541o, 201, 1, 0, 0, "", 0);
                } else {
                    C22613h1.m26485k(rh42.f64533d, rh42.f64541o, 201, 1, 0, 0, "", 0);
                }
            }
        } else if (mo33991b()) {
            rh4 rh43 = this.f61498b;
            C22613h1.m26485k(rh43.f64533d, rh43.f64541o, 201, 1, 0, 0, "", 0);
        } else if (mo33992c()) {
            rh4 rh44 = this.f61497a;
            C22613h1.m26485k(rh44.f64533d, rh44.f64541o, 201, 1, 0, 0, "", 0);
        }
    }

    /* renamed from: F */
    public void mo33986F() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, Long.valueOf(C31543z5.m39453c()));
    }

    /* renamed from: G */
    public void mo33987G(long j) {
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateHaokanRedDotTimestamp %s", Long.valueOf(j));
        mo33988H(j, true);
    }

    /* renamed from: H */
    public void mo33988H(long j, boolean z) {
        rh4 rh4 = this.f61498b;
        if (rh4 != null && !Util.isNullOrNil(rh4.f64533d)) {
            long c = C31543z5.m39453c() / 1000;
            Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "rec updateRedDotTimestamp %d, cur %d", Long.valueOf(j), Long.valueOf(c));
            if (j < mo34010u() || j <= 0 || c + 3600 < j) {
                Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, getRedDotTimestamp:%s", Long.valueOf(mo34010u()));
                return;
            }
            rh4 rh42 = this.f61498b;
            if (rh42 != null) {
                long j2 = rh42.f64541o;
                if (j < j2) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, showTime:%s", Long.valueOf(j2));
                    return;
                }
            }
            if (z) {
                C22613h1.m26484j(rh42, 106, 1, 0, j, "");
            }
            mo33995f();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_REDDOT_TIMESTAMP_LONG, Long.valueOf(j));
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    /* renamed from: I */
    public final void mo33989I(rh4 rh4) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT;
        if (!Util.isNullOrNil(rh4.f64547u)) {
            Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateInitTab %s", rh4.f64547u);
            try {
                if (new JSONObject(rh4.f64547u).optBoolean("has_wow_contents", true)) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                } else {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo33990a() {
        if (this.f61498b.f64544r >= C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, 0)) {
            return true;
        }
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowHaokanFindMoreEntryRedDot already click find more entry");
        return false;
    }

    /* renamed from: b */
    public boolean mo33991b() {
        int y = mo34014y(this.f61498b, 110);
        if (y == 0) {
            return mo33981A();
        }
        if (y != -3) {
            return false;
        }
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowHaokanRedDot");
        C22613h1.m26484j(this.f61498b, 104, 1, 0, 0, "");
        mo33995f();
        return false;
    }

    /* renamed from: c */
    public boolean mo33992c() {
        int y = mo34014y(this.f61497a, 100);
        if (y == 0) {
            return mo33981A();
        }
        if (y != -3) {
            return false;
        }
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        C22613h1.m26484j(this.f61497a, 104, 1, 0, 0, "");
        mo33994e();
        return false;
    }

    /* renamed from: d */
    public boolean mo33993d() {
        int y = mo34014y(this.f61499c, C90210f.CTRL_INDEX);
        if (y == 0) {
            return mo33981A();
        }
        if (y != -3) {
            return false;
        }
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearVideoTabRedDot");
        C22613h1.m26484j(this.f61499c, 104, 1, 0, 0, "");
        mo33996g();
        return false;
    }

    /* renamed from: e */
    public void mo33994e() {
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        rh4 rh4 = new rh4();
        this.f61497a = rh4;
        mo34015z(rh4);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING, "");
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: f */
    public final void mo33995f() {
        rh4 rh4 = new rh4();
        this.f61498b = rh4;
        mo34015z(rh4);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_RED_XML_REC_STRING, "");
        C86709a0.m107535s().mo121142i().mo119681a(true);
        C21032k.C21033a aVar = this.f61501e;
        if (aVar != null) {
            mo34010u();
            TopStoryHomeUIComponentImpl.C19327e eVar = (TopStoryHomeUIComponentImpl.C19327e) aVar;
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                if (C21914h.m25162j(next.f63546b)) {
                    TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19348d(eVar, next));
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public void mo33996g() {
        Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        rh4 rh4 = new rh4();
        this.f61499c = rh4;
        mo34015z(rh4);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING, "");
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: h */
    public void mo33997h(String str, long j, boolean z, int i, boolean z2) {
        int i2 = i;
        if (this.f61500d.size() != 0) {
            if (i2 <= mo34007r()) {
                Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickCmtRedDot invalid, seq:%s, curSeq:%s", Integer.valueOf(i), Integer.valueOf(mo34007r()));
                return;
            }
            int size = this.f61500d.size();
            String str2 = "";
            synchronized (this.f61500d) {
                while (this.f61500d.size() > 0 && this.f61500d.getFirst().f64546t <= i2) {
                    str2 = this.f61500d.getFirst().f64533d;
                    this.f61500d.removeFirst();
                }
            }
            if (size != this.f61500d.size()) {
                mo33982B();
            }
            if (this.f61501e != null) {
                if (this.f61500d.size() > 0) {
                    ((TopStoryHomeUIComponentImpl.C19327e) this.f61501e).mo24924c(this.f61500d.size(), this.f61500d.getFirst().f64533d, this.f61500d.getLast().f64533d, this.f61500d.getFirst().f64546t, this.f61500d.getLast().f64546t, this.f61500d.getLast().f64547u, z);
                } else {
                    ((TopStoryHomeUIComponentImpl.C19327e) this.f61501e).mo24924c(0, "", "", 0, 0, "", z);
                }
            }
            if (z2) {
                rh4 rh4 = new rh4();
                rh4.f64533d = str2;
                rh4.f64541o = j;
                rh4.f64546t = i2;
                C22613h1.m26484j(rh4, 106, 2, size, j, "");
            } else {
                long j2 = j;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_CMTREDDOT_TIMESTAMP_LONG, Long.valueOf(j));
            C86709a0.m107535s().mo121142i().mo119681a(true);
            Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateCmtRedDotSeq %s", Integer.valueOf(i));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_CMTREDDOT_SEQ_INT, Integer.valueOf(i));
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    /* renamed from: i */
    public void mo33998i() {
        rh4 rh4 = new rh4();
        rh4.f64533d = this.f61497a.f64533d;
        boolean z = true;
        C21032k.C21033a aVar = this.f61501e;
        if (aVar != null) {
            z = ((TopStoryHomeUIComponentImpl.C19327e) aVar).mo24922a(100);
        } else {
            Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickHomeTabRedDot redDotListener = null");
        }
        if (z) {
            C22613h1.m26484j(rh4, 106, 3, 0, 0, "");
        }
        mo33994e();
    }

    /* renamed from: j */
    public void mo33999j() {
        rh4 rh4 = new rh4();
        rh4.f64533d = this.f61499c.f64533d;
        boolean z = true;
        C21032k.C21033a aVar = this.f61501e;
        if (aVar != null) {
            z = ((TopStoryHomeUIComponentImpl.C19327e) aVar).mo24922a(C90210f.CTRL_INDEX);
        } else {
            Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickVideoTabRedDot redDotListener = null");
        }
        if (z) {
            C22613h1.m26484j(rh4, 106, 3, 0, 0, "");
        }
        mo33996g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x05ec, code lost:
        u73.C22613h1.m26484j(r12, 100, 1, 0, 0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x05fc, code lost:
        if (mo33981A() != false) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x05fe, code lost:
        u73.C22613h1.m26484j(r12, 108, 1, 0, 0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x060a, code lost:
        r0 = java.lang.System.currentTimeMillis() / 1000;
        r2 = new java.lang.Object[3];
        r2[0] = java.lang.Long.valueOf(r12.f64541o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x061d, code lost:
        if (r8.f61498b != null) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x061f, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0622, code lost:
        r3 = "" + r8.f61498b.f64541o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0637, code lost:
        r2[1] = r3;
        r2[2] = java.lang.Long.valueOf(r0);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "setTopStoryRedDot showTime new:%s, cur:%s, curTime:%s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0652, code lost:
        if (r12.f64541o > mo34010u()) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0654, code lost:
        u73.C22613h1.m26484j(r12, 103, 1, 0, 0, "");
        u73.C22613h1.m26484j(r12, 109, 1, 0, 0, "r6|" + r12.f64541o + "|" + mo34010u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0693, code lost:
        if (r12.f64541o <= (3600 + r0)) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0695, code lost:
        u73.C22613h1.m26484j(r12, 109, 1, 0, 0, "r10|" + r12.f64541o + "|" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x06ba, code lost:
        r0 = r8.f61498b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x06bc, code lost:
        if (r0 == null) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x06c4, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0.f64533d) != false) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x06c6, code lost:
        r0 = r8.f61498b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x06ce, code lost:
        if (r0.f64541o <= r12.f64541o) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x06d0, code lost:
        u73.C22613h1.m26484j(r12, 105, 1, 0, 0, r0.f64533d);
        u73.C22613h1.m26484j(r12, 109, 1, 0, 0, "r9|" + r12.f64541o + "|" + mo34010u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0708, code lost:
        r0 = r8.f61498b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x070e, code lost:
        if (r0.f64548v <= r12.f64548v) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0710, code lost:
        u73.C22613h1.m26484j(r12, 109, 1, 0, 0, "r11|" + r12.f64541o + "|" + mo34010u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x073e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0.f64533d) != false) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0740, code lost:
        u73.C22613h1.m26484j(r12, 105, 1, 0, 0, r12.f64533d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x074c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "setTopStoryRedDot valid");
        r8.f61498b = r12;
        f40.C86709a0.m107535s().mo121142i().mo119677K(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TOP_STORY_RED_XML_REC_STRING, mo34003n(r8.f61498b));
        f40.C86709a0.m107535s().mo121142i().mo119681a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0776, code lost:
        if (mo33981A() == false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0778, code lost:
        u73.C22613h1.m26484j(r8.f61498b, 101, 1, 0, 0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0785, code lost:
        r0 = r8.f61501e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0787, code lost:
        if (r0 == null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0789, code lost:
        ((com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0).mo24923b(r8.f61498b, 110);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0792, code lost:
        new com.tencent.p014mm.autogen.events.SearchSysMsgNotifyEvent().publish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x07a0, code lost:
        if (r9.containsKey(".sysmsg.mmsearch_reddot_new.sub_reddot") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x07a9, code lost:
        if ("sub_reddot.".equals(r10) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x07ab, code lost:
        mo34000k(r9, "sub_reddot.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0387, code lost:
        u73.C22613h1.m26484j(r12, 100, 1, 0, 0, "");
        mo33983C(r12);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34000k(java.util.Map<java.lang.String, java.lang.String> r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "entry"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r11 = 2
            if (r0 != r11) goto L_0x07b1
            te3.rh4 r12 = new te3.rh4
            r12.<init>()
            java.lang.String r1 = ""
            r12.f64540n = r1
            r12.f64533d = r1
            r12.f64539j = r1
            java.lang.String r1 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r2 = "recv %s, %s"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r4 = "mmsearch_reddot_new"
            r13 = 0
            r3[r13] = r4
            java.lang.String r4 = r19.toString()
            r14 = 1
            r3[r14] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".sysmsg.mmsearch_reddot_new."
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "clear"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r12.f64543q = r1
            r12.f64534e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "msgid"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r0, r1)
            r12.f64533d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "discovery"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64542p = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "android_cli_version"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64535f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "expire_time"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)
            r12.f64536g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "h5_version"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64537h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "reddot_type"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64538i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "reddot_text"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r12.f64539j = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "reddot_icon"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r12.f64540n = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "timestamp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)
            r12.f64541o = r0
            long r0 = eb0.C31543z5.m39453c()
            r12.f64544r = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "seq"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64546t = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "priority"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f64548v = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".sysmsg.mmsearch_reddot_new."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "ext_info"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r0, r1)
            r12.f64547u = r0
            int r1 = r12.f64543q
            r15 = 3
            if (r1 != r14) goto L_0x02ab
            int r0 = r12.f64538i
            switch(r0) {
                case 1: goto L_0x0266;
                case 2: goto L_0x0266;
                case 3: goto L_0x0266;
                case 4: goto L_0x0266;
                case 5: goto L_0x0215;
                case 6: goto L_0x0215;
                case 7: goto L_0x0250;
                case 8: goto L_0x0237;
                case 9: goto L_0x0215;
                case 10: goto L_0x022f;
                case 11: goto L_0x0215;
                case 12: goto L_0x0237;
                case 13: goto L_0x0237;
                case 14: goto L_0x0237;
                case 15: goto L_0x0237;
                case 16: goto L_0x0216;
                case 17: goto L_0x0216;
                case 18: goto L_0x0216;
                case 19: goto L_0x0216;
                default: goto L_0x0215;
            }
        L_0x0215:
            goto L_0x0273
        L_0x0216:
            r18.mo33996g()
            hz.k$a r0 = r8.f61501e
            if (r0 == 0) goto L_0x0226
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r0 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0
            r0.mo24926e(r1)
        L_0x0226:
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
            goto L_0x0273
        L_0x022f:
            r0 = 0
            java.lang.String r2 = ""
            r8.mo33984D(r2, r2, r0)
            goto L_0x0273
        L_0x0237:
            r18.mo33994e()
            hz.k$a r0 = r8.f61501e
            if (r0 == 0) goto L_0x0247
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r0 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0
            r0.mo24925d(r1)
        L_0x0247:
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
            goto L_0x0273
        L_0x0250:
            long r3 = r12.f64541o
            r5 = 1
            int r6 = r12.f64546t
            r7 = 0
            java.lang.String r2 = ""
            r1 = r18
            r1.mo33997h(r2, r3, r5, r6, r7)
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
            goto L_0x0273
        L_0x0266:
            long r0 = r12.f64541o
            r8.mo33988H(r0, r13)
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
        L_0x0273:
            r2 = 100
            int r0 = r12.f64538i
            r1 = 7
            if (r0 == r1) goto L_0x0289
            r1 = 8
            if (r0 == r1) goto L_0x0287
            r1 = 9
            if (r0 == r1) goto L_0x0284
            r3 = 1
            goto L_0x028a
        L_0x0284:
            r11 = 4
            r3 = 4
            goto L_0x028a
        L_0x0287:
            r3 = 3
            goto L_0x028a
        L_0x0289:
            r3 = 2
        L_0x028a:
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            java.lang.String r0 = ".sysmsg.mmsearch_reddot_new.sub_reddot"
            boolean r0 = r9.containsKey(r0)
            if (r0 == 0) goto L_0x02aa
            java.lang.String r0 = "sub_reddot."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "sub_reddot."
            r8.mo34000k(r9, r0)
        L_0x02aa:
            return
        L_0x02ab:
            int r1 = r12.f64538i
            switch(r1) {
                case 1: goto L_0x05e9;
                case 2: goto L_0x05ec;
                case 3: goto L_0x05ec;
                case 4: goto L_0x05ec;
                case 5: goto L_0x02b0;
                case 6: goto L_0x02b0;
                case 7: goto L_0x0423;
                case 8: goto L_0x0412;
                case 9: goto L_0x03c1;
                case 10: goto L_0x03aa;
                case 11: goto L_0x0398;
                case 12: goto L_0x0384;
                case 13: goto L_0x0387;
                case 14: goto L_0x0387;
                case 15: goto L_0x0387;
                case 16: goto L_0x02cf;
                case 17: goto L_0x02cf;
                case 18: goto L_0x02cf;
                case 19: goto L_0x02cf;
                default: goto L_0x02b0;
            }
        L_0x02b0:
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "r12|"
            r0.append(r1)
            int r1 = r12.f64538i
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x02cf:
            r2 = 100
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r1 = r12.f64533d
            r0[r13] = r1
            java.lang.String r11 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r1 = "setVideoRedDot %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            boolean r0 = r18.mo33981A()
            if (r0 != 0) goto L_0x02fb
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x02fb:
            java.lang.String r0 = "topstoryTopTabParam"
            org.json.JSONObject r0 = u73.C78137s0.m94340d(r0)     // Catch:{ Exception -> 0x0324 }
            java.lang.String r1 = "tabs"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ Exception -> 0x0324 }
            r1 = 0
        L_0x030a:
            int r2 = r0.length()     // Catch:{ Exception -> 0x0324 }
            if (r1 >= r2) goto L_0x0332
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0324 }
            java.lang.String r3 = "category"
            int r2 = r2.getInt(r3)     // Catch:{ Exception -> 0x0324 }
            boolean r2 = p03.C21914h.m25164l(r2)     // Catch:{ Exception -> 0x0324 }
            if (r2 == 0) goto L_0x0321
            goto L_0x0333
        L_0x0321:
            int r1 = r1 + 1
            goto L_0x030a
        L_0x0324:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = r0.getMessage()
            r1[r13] = r0
            java.lang.String r0 = "parse topstoryTopTabParam failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r0, r1)
        L_0x0332:
            r13 = 1
        L_0x0333:
            if (r13 == 0) goto L_0x0341
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = "no exist video tab"
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x0341:
            r8.f61499c = r12
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING
            te3.rh4 r2 = r8.f61499c
            java.lang.String r2 = r8.mo34003n(r2)
            r0.mo119677K(r1, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119681a(r14)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 3
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            hz.k$a r0 = r8.f61501e
            if (r0 == 0) goto L_0x037a
            te3.rh4 r1 = r8.f61499c
            r2 = 666(0x29a, float:9.33E-43)
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r0 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0
            r0.mo24923b(r1, r2)
        L_0x037a:
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
            goto L_0x079a
        L_0x0384:
            r8.mo33989I(r12)
        L_0x0387:
            r2 = 100
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r8.mo33983C(r12)
            goto L_0x079a
        L_0x0398:
            r2 = 100
            r3 = 11
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r8.mo33989I(r12)
            goto L_0x079a
        L_0x03aa:
            r2 = 100
            r3 = 5
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            java.lang.String r0 = r12.f64533d
            java.lang.String r1 = r12.f64547u
            long r2 = r12.f64541o
            r8.mo33984D(r0, r1, r2)
            goto L_0x079a
        L_0x03c1:
            hz.k$a r2 = r8.f61501e
            if (r2 == 0) goto L_0x079a
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r2 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r2
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl r2 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.this
            com.tencent.mm.plugin.topstory.ui.webview.e r2 = r2.f54512j
            if (r2 == 0) goto L_0x0404
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "params"
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x03dd }
            java.lang.String r0 = "reddotType"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x03dd }
            goto L_0x03f8
        L_0x03dd:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "onWebRecommendNotifyReddotExtMsg json exception: "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.TopStory.TopStoryWebViewJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x03f8:
            java.lang.String r0 = r3.toString()
            com.tencent.mm.plugin.topstory.ui.webview.g r1 = new com.tencent.mm.plugin.topstory.ui.webview.g
            r1.<init>(r2, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x0404:
            r2 = 100
            r3 = 4
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x0412:
            r2 = 100
            r3 = 3
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r8.mo33983C(r12)
            goto L_0x079a
        L_0x0423:
            r2 = 100
            r3 = 2
            java.util.LinkedList<te3.rh4> r0 = r8.f61500d
            int r4 = r0.size()
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            java.lang.String r0 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r1 = "start addCmtRedDot: %s"
            java.lang.Object[] r2 = new java.lang.Object[r14]
            int r3 = r12.f64546t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            boolean r0 = r18.mo33981A()
            if (r0 != 0) goto L_0x045d
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 2
            java.util.LinkedList<te3.rh4> r0 = r8.f61500d
            int r4 = r0.size()
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x045d:
            int r0 = r12.f64546t
            int r1 = r18.mo34007r()
            if (r0 > r1) goto L_0x04c0
            java.lang.String r0 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r1 = "addCmtRedDot invalid1, %s, %s"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            int r3 = r12.f64546t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            int r3 = r18.mo34007r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r14] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            r2 = 103(0x67, float:1.44E-43)
            r0 = 2
            int r4 = r18.mo34006q()
            r13 = 0
            java.lang.String r7 = ""
            r3 = 2
            r5 = 0
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r2 = 109(0x6d, float:1.53E-43)
            int r4 = r18.mo34006q()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "r6|"
            r1.append(r3)
            int r3 = r12.f64546t
            r1.append(r3)
            java.lang.String r3 = "|"
            r1.append(r3)
            int r3 = r18.mo34007r()
            r1.append(r3)
            java.lang.String r7 = r1.toString()
            r1 = r12
            r3 = r0
            r5 = r13
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x04c0:
            java.util.LinkedList<te3.rh4> r15 = r8.f61500d
            monitor-enter(r15)
            java.util.LinkedList<te3.rh4> r0 = r8.f61500d     // Catch:{ all -> 0x05e6 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x0509
            r0 = 0
        L_0x04cc:
            java.util.LinkedList<te3.rh4> r1 = r8.f61500d     // Catch:{ all -> 0x05e6 }
            int r1 = r1.size()     // Catch:{ all -> 0x05e6 }
            if (r0 >= r1) goto L_0x050a
            java.util.LinkedList<te3.rh4> r1 = r8.f61500d     // Catch:{ all -> 0x05e6 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x05e6 }
            te3.rh4 r1 = (te3.rh4) r1     // Catch:{ all -> 0x05e6 }
            java.lang.String r2 = r1.f64533d     // Catch:{ all -> 0x05e6 }
            java.lang.String r3 = r12.f64533d     // Catch:{ all -> 0x05e6 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x05e6 }
            if (r2 == 0) goto L_0x04ff
            java.lang.String r0 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r1 = "addCmtRedDot invalid3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x05e6 }
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 2
            int r4 = r18.mo34006q()     // Catch:{ all -> 0x05e6 }
            r5 = 0
            java.lang.String r7 = "r11"
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)     // Catch:{ all -> 0x05e6 }
            monitor-exit(r15)     // Catch:{ all -> 0x05e6 }
            goto L_0x079a
        L_0x04ff:
            int r1 = r1.f64546t     // Catch:{ all -> 0x05e6 }
            int r2 = r12.f64546t     // Catch:{ all -> 0x05e6 }
            if (r1 <= r2) goto L_0x0506
            goto L_0x050a
        L_0x0506:
            int r0 = r0 + 1
            goto L_0x04cc
        L_0x0509:
            r0 = 0
        L_0x050a:
            java.util.LinkedList<te3.rh4> r1 = r8.f61500d     // Catch:{ all -> 0x05e6 }
            r1.add(r0, r12)     // Catch:{ all -> 0x05e6 }
            boolean r0 = r18.mo33981A()     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x0529
            te3.rh4 r1 = r18.mo34004o()     // Catch:{ all -> 0x05e6 }
            r2 = 101(0x65, float:1.42E-43)
            r3 = 2
            java.util.LinkedList<te3.rh4> r0 = r8.f61500d     // Catch:{ all -> 0x05e6 }
            int r4 = r0.size()     // Catch:{ all -> 0x05e6 }
            r5 = 0
            java.lang.String r7 = ""
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)     // Catch:{ all -> 0x05e6 }
        L_0x0529:
            java.lang.String r0 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r1 = "addCmtRedDot msgId:%s, showTime:%s"
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x05e6 }
            java.lang.String r3 = r12.f64533d     // Catch:{ all -> 0x05e6 }
            r2[r13] = r3     // Catch:{ all -> 0x05e6 }
            long r3 = r12.f64541o     // Catch:{ all -> 0x05e6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05e6 }
            r2[r14] = r3     // Catch:{ all -> 0x05e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x05e6 }
            monitor-exit(r15)     // Catch:{ all -> 0x05e6 }
            r18.mo33982B()
            hz.k$a r0 = r8.f61501e
            if (r0 == 0) goto L_0x05dc
            java.util.LinkedList<te3.rh4> r1 = r8.f61500d
            int r1 = r1.size()
            java.util.LinkedList<te3.rh4> r2 = r8.f61500d
            java.lang.Object r2 = r2.getFirst()
            te3.rh4 r2 = (te3.rh4) r2
            java.lang.String r12 = r2.f64533d
            java.util.LinkedList<te3.rh4> r2 = r8.f61500d
            java.lang.Object r2 = r2.getLast()
            te3.rh4 r2 = (te3.rh4) r2
            java.lang.String r2 = r2.f64533d
            java.util.LinkedList<te3.rh4> r3 = r8.f61500d
            java.lang.Object r3 = r3.getFirst()
            te3.rh4 r3 = (te3.rh4) r3
            int r14 = r3.f64546t
            java.util.LinkedList<te3.rh4> r3 = r8.f61500d
            java.lang.Object r3 = r3.getLast()
            te3.rh4 r3 = (te3.rh4) r3
            int r15 = r3.f64546t
            java.util.LinkedList<te3.rh4> r3 = r8.f61500d
            java.lang.Object r3 = r3.getLast()
            te3.rh4 r3 = (te3.rh4) r3
            java.lang.String r3 = r3.f64547u
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r0 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl r4 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.this
            com.tencent.mm.plugin.topstory.ui.webview.e r11 = r4.f54512j
            if (r11 == 0) goto L_0x058e
            r13 = r2
            r16 = r1
            r17 = r3
            r11.mo25065p(r12, r13, r14, r15, r16, r17)
        L_0x058e:
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl r3 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.this
            java.util.List<t03.h$c> r3 = r3.f54516q
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0598:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x05dc
            java.lang.Object r4 = r3.next()
            t03.h$c r4 = (t03.C22426h.C22429c) r4
            int r5 = r4.f63546b
            boolean r5 = p03.C21914h.m25162j(r5)
            if (r5 == 0) goto L_0x0598
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl r5 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.this
            com.tencent.mm.ui.MMActivity r5 = r5.f54506d
            com.tencent.mm.plugin.topstory.ui.home.c r6 = new com.tencent.mm.plugin.topstory.ui.home.c
            r6.<init>(r0, r4, r1, r2)
            r5.runOnUiThread(r6)
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl r4 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.this
            boolean r4 = r4.f54521v
            if (r4 != 0) goto L_0x0598
            java.lang.Class<p03.d> r4 = p03.C21912d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            p03.d r4 = (p03.C21912d) r4
            hz.k r4 = r4.mo34966t4()
            o03.h r4 = (o03.C21723h) r4
            te3.rh4 r11 = r4.mo34004o()
            r12 = 107(0x6b, float:1.5E-43)
            r13 = 2
            r15 = 0
            java.lang.String r17 = ""
            r14 = r1
            u73.C22613h1.m26484j(r11, r12, r13, r14, r15, r17)
            goto L_0x0598
        L_0x05dc:
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
            goto L_0x079a
        L_0x05e6:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x05e6 }
            throw r0
        L_0x05e9:
            r8.mo33989I(r12)
        L_0x05ec:
            r2 = 100
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            boolean r0 = r18.mo33981A()
            if (r0 != 0) goto L_0x060a
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x060a:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.Object[] r2 = new java.lang.Object[r15]
            long r3 = r12.f64541o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            te3.rh4 r3 = r8.f61498b
            if (r3 != 0) goto L_0x0622
            java.lang.String r3 = "null"
            goto L_0x0637
        L_0x0622:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            te3.rh4 r4 = r8.f61498b
            long r4 = r4.f64541o
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0637:
            r2[r14] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2[r11] = r3
            java.lang.String r11 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            java.lang.String r3 = "setTopStoryRedDot showTime new:%s, cur:%s, curTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r2)
            long r2 = r12.f64541o
            long r4 = r18.mo34010u()
            java.lang.String r13 = "|"
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x068c
            r2 = 103(0x67, float:1.44E-43)
            r0 = 1
            r11 = 0
            r14 = 0
            java.lang.String r7 = ""
            r3 = 1
            r4 = 0
            r5 = 0
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "r6|"
            r1.append(r3)
            long r3 = r12.f64541o
            r1.append(r3)
            r1.append(r13)
            long r3 = r18.mo34010u()
            r1.append(r3)
            java.lang.String r7 = r1.toString()
            r1 = r12
            r3 = r0
            r4 = r11
            r5 = r14
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x068c:
            long r2 = r12.f64541o
            r4 = 3600(0xe10, double:1.7786E-320)
            long r4 = r4 + r0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x06ba
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "r10|"
            r7.append(r11)
            long r14 = r12.f64541o
            r7.append(r14)
            r7.append(r13)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x06ba:
            te3.rh4 r0 = r8.f61498b
            if (r0 == 0) goto L_0x0708
            java.lang.String r0 = r0.f64533d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0708
            te3.rh4 r0 = r8.f61498b
            long r1 = r0.f64541o
            long r3 = r12.f64541o
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0708
            r2 = 105(0x69, float:1.47E-43)
            r11 = 1
            r14 = 0
            r15 = 0
            java.lang.String r7 = r0.f64533d
            r3 = 1
            r4 = 0
            r5 = 0
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "r9|"
            r0.append(r1)
            long r3 = r12.f64541o
            r0.append(r3)
            r0.append(r13)
            long r3 = r18.mo34010u()
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r1 = r12
            r3 = r11
            r4 = r14
            r5 = r15
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x0708:
            te3.rh4 r0 = r8.f61498b
            int r1 = r0.f64548v
            int r2 = r12.f64548v
            if (r1 <= r2) goto L_0x0738
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "r11|"
            r0.append(r1)
            long r14 = r12.f64541o
            r0.append(r14)
            r0.append(r13)
            long r13 = r18.mo34010u()
            r0.append(r13)
            java.lang.String r7 = r0.toString()
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
            goto L_0x079a
        L_0x0738:
            java.lang.String r0 = r0.f64533d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x074c
            r2 = 105(0x69, float:1.47E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = r12.f64533d
            r1 = r12
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x074c:
            java.lang.String r0 = "setTopStoryRedDot valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r8.f61498b = r12
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TOP_STORY_RED_XML_REC_STRING
            te3.rh4 r2 = r8.f61498b
            java.lang.String r2 = r8.mo34003n(r2)
            r0.mo119677K(r1, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119681a(r14)
            boolean r0 = r18.mo33981A()
            if (r0 == 0) goto L_0x0785
            te3.rh4 r1 = r8.f61498b
            r2 = 101(0x65, float:1.42E-43)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r7 = ""
            u73.C22613h1.m26484j(r1, r2, r3, r4, r5, r7)
        L_0x0785:
            hz.k$a r0 = r8.f61501e
            if (r0 == 0) goto L_0x0792
            te3.rh4 r1 = r8.f61498b
            r2 = 110(0x6e, float:1.54E-43)
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e r0 = (com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl.C19327e) r0
            r0.mo24923b(r1, r2)
        L_0x0792:
            com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent r0 = new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent
            r0.<init>()
            r0.publish()
        L_0x079a:
            java.lang.String r0 = ".sysmsg.mmsearch_reddot_new.sub_reddot"
            boolean r0 = r9.containsKey(r0)
            if (r0 == 0) goto L_0x07b1
            java.lang.String r0 = "sub_reddot."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x07b1
            java.lang.String r0 = "sub_reddot."
            r8.mo34000k(r9, r0)
        L_0x07b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o03.C21723h.mo34000k(java.util.Map, java.lang.String):void");
    }

    /* renamed from: l */
    public final int mo34001l(rh4 rh4, rh4 rh42, int i) {
        int i2 = rh4.f64548v;
        int i3 = rh42.f64548v;
        if (i2 > i3) {
            return mo34009t(rh4);
        }
        if (i2 < i3) {
            return mo34009t(rh42);
        }
        long j = rh4.f64544r;
        long j2 = rh42.f64544r;
        return j > j2 ? mo34009t(rh4) : j < j2 ? mo34009t(rh42) : i;
    }

    /* renamed from: m */
    public final void mo34002m(rh4 rh4, String[] strArr) {
        rh4.f64533d = strArr[0];
        rh4.f64543q = Integer.valueOf(strArr[1]).intValue();
        rh4.f64535f = Integer.valueOf(strArr[2]).intValue();
        rh4.f64542p = Integer.valueOf(strArr[3]).intValue();
        rh4.f64534e = Integer.valueOf(strArr[4]).intValue();
        rh4.f64536g = Long.valueOf(strArr[5]).longValue();
        rh4.f64537h = Integer.valueOf(strArr[6]).intValue();
        rh4.f64544r = Long.valueOf(strArr[7]).longValue();
        rh4.f64539j = strArr[8];
        rh4.f64538i = Integer.valueOf(strArr[9]).intValue();
        rh4.f64545s = Integer.valueOf(strArr[10]).intValue();
        rh4.f64541o = Long.valueOf(strArr[11]).longValue();
        rh4.f64540n = strArr[12];
        if (strArr.length > 13) {
            rh4.f64546t = Integer.valueOf(strArr[13]).intValue();
        } else {
            rh4.f64546t = 0;
            if (rh4.f64538i == 7) {
                Log.m105924i("MicroMsg.TopStory.TopStoryRedDotImpl", "no seq");
            }
        }
        if (strArr.length > 14) {
            rh4.f64547u = strArr[14];
        } else {
            rh4.f64547u = "";
        }
    }

    /* renamed from: n */
    public String mo34003n(rh4 rh4) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{rh4.f64533d, Integer.valueOf(rh4.f64543q), Integer.valueOf(rh4.f64535f), Integer.valueOf(rh4.f64542p), Integer.valueOf(rh4.f64534e), Long.valueOf(rh4.f64536g), Integer.valueOf(rh4.f64537h), Long.valueOf(rh4.f64544r), rh4.f64539j, Integer.valueOf(rh4.f64538i), Integer.valueOf(rh4.f64545s), Long.valueOf(rh4.f64541o), rh4.f64540n, Integer.valueOf(rh4.f64546t), rh4.f64547u});
    }

    /* renamed from: o */
    public rh4 mo34004o() {
        synchronized (this.f61500d) {
            if (Util.isNullOrNil((List) this.f61500d)) {
                return null;
            }
            rh4 last = this.f61500d.getLast();
            return last;
        }
    }

    /* renamed from: p */
    public int mo34005p() {
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCount %s", Integer.valueOf(this.f61500d.size()));
        return this.f61500d.size();
    }

    /* renamed from: q */
    public final int mo34006q() {
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCountForReport %s", Integer.valueOf(this.f61500d.size()));
        return this.f61500d.size();
    }

    /* renamed from: r */
    public int mo34007r() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TOP_STORY_CMTREDDOT_SEQ_INT, (Object) null);
        if (f == null) {
            return -1;
        }
        return ((Integer) f).intValue();
    }

    /* renamed from: s */
    public int mo34008s(int i) {
        if (mo34005p() > 0) {
            return 110;
        }
        boolean b = mo33991b();
        boolean c = mo33992c();
        boolean d = mo33993d();
        if (b && c && d) {
            int max = Math.max(Math.max(this.f61497a.f64548v, this.f61498b.f64548v), this.f61499c.f64548v);
            long min = Math.min(Math.max(this.f61497a.f64544r, this.f61498b.f64544r), this.f61499c.f64544r);
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(this.f61497a.f64548v));
            hashSet.add(Integer.valueOf(this.f61498b.f64548v));
            hashSet.add(Integer.valueOf(this.f61499c.f64548v));
            if (hashSet.size() == 1) {
                if (this.f61497a.f64544r == min) {
                    return 100;
                }
                if (this.f61498b.f64544r == min) {
                    return 110;
                }
                if (this.f61499c.f64544r == min) {
                    return C90210f.CTRL_INDEX;
                }
            }
            if (hashSet.size() == 2) {
                rh4 rh4 = this.f61497a;
                int i2 = rh4.f64548v;
                if (i2 == max) {
                    rh4 rh42 = this.f61498b;
                    if (rh42.f64548v == max) {
                        return rh4.f64544r > rh42.f64544r ? 100 : 110;
                    }
                    rh4 rh43 = this.f61499c;
                    if (rh43.f64548v != max || rh4.f64544r > rh43.f64544r) {
                        return 100;
                    }
                    return C90210f.CTRL_INDEX;
                }
                rh4 rh44 = this.f61498b;
                int i3 = rh44.f64548v;
                if (i3 != max) {
                    rh4 rh45 = this.f61499c;
                    if (rh45.f64548v == max) {
                        if (i3 == max) {
                            if (rh45.f64544r > rh44.f64544r) {
                                return C90210f.CTRL_INDEX;
                            }
                            return 110;
                        } else if (i2 != max || rh45.f64544r > rh4.f64544r) {
                            return C90210f.CTRL_INDEX;
                        } else {
                            return 100;
                        }
                    }
                } else if (i2 == max) {
                    return rh44.f64544r > rh4.f64544r ? 110 : 100;
                } else {
                    rh4 rh46 = this.f61499c;
                    if (rh46.f64548v != max || rh44.f64544r > rh46.f64544r) {
                        return 110;
                    }
                    return C90210f.CTRL_INDEX;
                }
            }
            if (hashSet.size() == 3) {
                if (this.f61498b.f64548v == max) {
                    return 110;
                }
                if (this.f61497a.f64548v == max) {
                    return 100;
                }
                if (this.f61499c.f64548v == max) {
                    return C90210f.CTRL_INDEX;
                }
            }
            return i;
        } else if (b && c) {
            return mo34001l(this.f61498b, this.f61497a, i);
        } else {
            if (b && d) {
                return mo34001l(this.f61498b, this.f61499c, i);
            }
            if (c && d) {
                return mo34001l(this.f61497a, this.f61499c, i);
            }
            if (b) {
                return 110;
            }
            if (c) {
                return 100;
            }
            return d ? C90210f.CTRL_INDEX : i;
        }
    }

    /* renamed from: t */
    public final int mo34009t(rh4 rh4) {
        if (rh4 == this.f61497a) {
            return 100;
        }
        if (rh4 != this.f61498b && rh4 == this.f61499c) {
            return C90210f.CTRL_INDEX;
        }
        return 110;
    }

    /* renamed from: u */
    public long mo34010u() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TOP_STORY_REDDOT_TIMESTAMP_LONG, (Object) null);
        if (f == null) {
            return 0;
        }
        return ((Long) f).longValue();
    }

    /* renamed from: v */
    public String mo34011v() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, "");
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("extInfo");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: w */
    public String mo34012w() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, "");
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("msgId", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: x */
    public long mo34013x() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, "");
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        try {
            return (long) new JSONObject(str).optInt("ts", 0);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: y */
    public int mo34014y(rh4 rh4, int i) {
        if (Util.isNullOrNil(rh4.f64533d)) {
            return -5;
        }
        boolean z = true;
        if (rh4.f64543q == 1) {
            return -1;
        }
        int i2 = rh4.f64535f;
        if (i2 > C89625d.f257841g) {
            Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s clientVersion %d invalid ,curVer is %d", rh4.f64533d, Integer.valueOf(i2), Integer.valueOf(C89625d.f257841g));
            return -2;
        }
        long j = rh4.f64536g;
        if (j != 0) {
            if (System.currentTimeMillis() > rh4.f64544r + (j * 1000)) {
                Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s expired", rh4.f64533d);
                return -3;
            }
        }
        Object[] objArr = new Object[5];
        objArr[0] = Boolean.valueOf(C43471q.m46977a(1) >= rh4.f64537h);
        objArr[1] = Integer.valueOf(rh4.f64537h);
        objArr[2] = Integer.valueOf(C43471q.m46977a(1));
        objArr[3] = Long.valueOf(rh4.f64541o);
        objArr[4] = Long.valueOf(mo34010u());
        Log.m105925i("MicroMsg.TopStory.TopStoryRedDotImpl", "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d", objArr);
        boolean z2 = C43471q.m46977a(1) >= rh4.f64537h;
        if (110 == i) {
            if (!z2 || this.f61498b.f64541o <= mo34010u()) {
                z = false;
            }
            z2 = z;
        }
        return !z2 ? -4 : 0;
    }

    /* renamed from: z */
    public final void mo34015z(rh4 rh4) {
        rh4.f64540n = "";
        rh4.f64533d = "";
        rh4.f64539j = "";
    }
}
