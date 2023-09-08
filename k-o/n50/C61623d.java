package n50;

import android.graphics.Point;
import android.view.TextureView;
import android.widget.FrameLayout;
import b50.C54407c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58115i;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import n50.C61620c;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s50.C63714v;
import s50.C63721y;
import te3.C64500kt2;
import te3.C64535lt2;
import z04.C119027c;
import z40.C66733d;

/* renamed from: n50.d */
public class C61623d {

    /* renamed from: a */
    public final C61625b f175235a;

    /* renamed from: b */
    public TRTCCloud f175236b;

    /* renamed from: c */
    public boolean f175237c;

    /* renamed from: d */
    public ArrayList<C61626c> f175238d;

    /* renamed from: e */
    public String f175239e;

    /* renamed from: f */
    public String f175240f;

    /* renamed from: g */
    public HashMap<String, C63714v> f175241g;

    /* renamed from: h */
    public int f175242h = 1258344707;

    /* renamed from: i */
    public int f175243i = 58415;

    /* renamed from: j */
    public int f175244j = 0;

    /* renamed from: k */
    public C61613a f175245k = null;

    /* renamed from: l */
    public C58115i f175246l = null;

    /* renamed from: m */
    public String f175247m = null;

    /* renamed from: n */
    public int f175248n = 1;

    /* renamed from: o */
    public JSONObject f175249o = null;

    /* renamed from: p */
    public MTimerHandler f175250p = new MTimerHandler("link_mic_sei_sender", (MTimerHandler.CallBack) new C61624a(), true);

    /* renamed from: q */
    public JSONObject f175251q = null;

    /* renamed from: r */
    public JSONArray f175252r = null;

    /* renamed from: n50.d$a */
    public class C61624a implements MTimerHandler.CallBack {
        public C61624a() {
        }

        public boolean onTimerExpired() {
            JSONObject jSONObject = C61623d.this.f175249o;
            if (jSONObject != null) {
                String optString = jSONObject.optString("d");
                try {
                    C64500kt2 kt22 = new C64500kt2();
                    kt22.parseFrom(optString.getBytes(C119027c.f356488a));
                    LinkedList<C64535lt2> linkedList = kt22.f183982d;
                    if (linkedList != null) {
                        Iterator<C64535lt2> it = linkedList.iterator();
                        while (it.hasNext()) {
                            C64535lt2 next = it.next();
                            C61619b b = C61620c.C61622b.f175234a.mo86554b(next.f184154d);
                            if (b != null) {
                                if (b.f175225h <= C61623d.this.f175244j) {
                                    next.f184156f |= 1;
                                } else {
                                    next.f184156f = 0;
                                }
                            }
                        }
                    }
                    C61623d.this.f175249o.putOpt("d", new String(kt22.toByteArray()));
                    C61623d dVar = C61623d.this;
                    dVar.f175236b.sendSEIMsg(dVar.f175249o.toString().getBytes(), 1);
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.LiveCoreVisitor", "send mic sei fail! %s", e.getMessage());
                }
            }
            return true;
        }
    }

    /* renamed from: n50.d$b */
    public interface C61625b {
        /* renamed from: G */
        void mo75574G(JSONArray jSONArray, JSONObject jSONObject);
    }

    /* renamed from: n50.d$c */
    public static class C61626c {

        /* renamed from: a */
        public String f175254a;

        /* renamed from: b */
        public int f175255b;

        /* renamed from: c */
        public boolean f175256c = true;

        /* renamed from: d */
        public int f175257d = 0;

        /* renamed from: e */
        public int f175258e = 0;
    }

    public C61623d(TRTCCloud tRTCCloud, C61625b bVar, boolean z, int i, C58115i iVar) {
        this.f175236b = tRTCCloud;
        this.f175235a = bVar;
        this.f175237c = z;
        this.f175238d = new ArrayList<>();
        this.f175241g = new HashMap<>();
        this.f175244j = i;
        this.f175246l = iVar;
        this.f175245k = new C61613a(i, this);
    }

    /* renamed from: a */
    public final String mo86558a(int i, int i2) {
        return String.valueOf(((float) i) / ((float) i2));
    }

    /* renamed from: b */
    public final void mo86559b(JSONObject jSONObject, TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        ArrayList<TRTCCloudDef.TRTCMixUser> arrayList;
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        boolean z = cVar != null && cVar.mo75198R6();
        if (tRTCTranscodingConfig == null || (arrayList = tRTCTranscodingConfig.mixUsers) == null || arrayList.size() <= 4 || jSONObject == null || !z) {
            Log.m105924i("MicroMsg.LiveCoreVisitor", "checkAppendHoldList return, holdSwitch " + z);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            int size = tRTCTranscodingConfig.mixUsers.size();
            if (size == 5) {
                jSONObject2.putOpt("x", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).f165818x, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("y", mo86558a(tRTCTranscodingConfig.mixUsers.get(3).f165819y, tRTCTranscodingConfig.videoHeight));
                jSONObject2.putOpt("w", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).width, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("h", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).height, tRTCTranscodingConfig.videoHeight));
                jSONArray.put(jSONObject2);
            } else if (size == 7) {
                jSONObject2.putOpt("x", mo86558a(tRTCTranscodingConfig.mixUsers.get(1).f165818x, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("y", mo86558a(tRTCTranscodingConfig.mixUsers.get(6).f165819y, tRTCTranscodingConfig.videoHeight));
                jSONObject2.putOpt("w", mo86558a(tRTCTranscodingConfig.mixUsers.get(1).width * 2, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("h", mo86558a(tRTCTranscodingConfig.mixUsers.get(1).height, tRTCTranscodingConfig.videoHeight));
                jSONArray.put(jSONObject2);
            } else if (size == 8) {
                jSONObject2.putOpt("x", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).f165818x, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("y", mo86558a(tRTCTranscodingConfig.mixUsers.get(6).f165819y, tRTCTranscodingConfig.videoHeight));
                jSONObject2.putOpt("w", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).width, tRTCTranscodingConfig.videoWidth));
                jSONObject2.putOpt("h", mo86558a(tRTCTranscodingConfig.mixUsers.get(2).height, tRTCTranscodingConfig.videoHeight));
                jSONArray.put(jSONObject2);
            }
            jSONObject.putOpt("hl", jSONArray);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public final String mo86560c(int i, int i2) {
        String str = "408";
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (i2 == 0) {
                        str = "2075";
                    } else if (i2 == 1) {
                        str = "2076";
                    } else if (i2 == 2) {
                        str = "2077";
                    }
                }
            } else if (i2 == 0) {
                str = "2073";
            } else if (i2 == 1) {
                str = "410";
            } else if (i2 == 2) {
                str = "2074";
            }
        } else if (i2 != 0) {
            if (i2 == 1) {
                str = "409";
            } else if (i2 == 2) {
                str = "2072";
            }
        }
        Log.m105924i("MicroMsg.LiveCoreVisitor", "chooseLinkMicBackground: " + str);
        return str;
    }

    /* renamed from: d */
    public final void mo86561d(List<C61619b> list, TRTCCloudDef.TRTCMixUser tRTCMixUser, TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig, String str, Point point, int i, int i2) {
        C61623d dVar = this;
        TRTCCloudDef.TRTCMixUser tRTCMixUser2 = tRTCMixUser;
        TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig2 = tRTCTranscodingConfig;
        String str2 = str;
        Point point2 = point;
        int size = list.size();
        int i3 = point2.x;
        int i4 = point2.y;
        tRTCMixUser2.f165818x = i3;
        tRTCMixUser2.f165819y = i4;
        boolean z = true;
        Log.m105925i("MicroMsg.LiveCoreVisitor", "configRoomPkParams: userConfigList.size:%d, roomId:%s, originX:%d, originY:%d, videoWidth:%d, videoHeight:%d", Integer.valueOf(size), str2, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        if (size == 0) {
            tRTCMixUser2.width = i / 2;
            tRTCMixUser2.height = i2 / 2;
        } else if (size == 1) {
            int i5 = i / 2;
            tRTCMixUser2.width = i5;
            int i6 = i2 / 4;
            tRTCMixUser2.height = i6;
            Iterator<C61619b> it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C61619b next = it.next();
                Iterator<C61619b> it4 = it;
                TRTCCloudDef.TRTCMixUser tRTCMixUser3 = new TRTCCloudDef.TRTCMixUser();
                tRTCMixUser3.roomId = str2;
                String str3 = next.f175221d;
                tRTCMixUser3.userId = str3;
                tRTCMixUser3.streamType = next.f175222e;
                i7++;
                tRTCMixUser3.zOrder = i7;
                tRTCMixUser3.pureAudio = true;
                tRTCMixUser3.width = i5;
                tRTCMixUser3.height = i6;
                tRTCMixUser3.f165818x = i3;
                tRTCMixUser3.f165819y = tRTCMixUser2.height + i4;
                C61626c h = dVar.mo86565h(str3, 0);
                if (h != null) {
                    tRTCMixUser3.pureAudio = h.f175256c;
                }
                Log.m105924i("MicroMsg.LiveCoreVisitor", "updateCloudMixtureParams userId " + tRTCMixUser3.userId + ", pureAudioMode: " + tRTCMixUser3.pureAudio + ", userStream: " + h);
                Log.m105925i("MicroMsg.LiveCoreVisitor", "configRoomPkParams: add mixUser, userId:%s, x:%d, y:%d, width:%d, height:%d", tRTCMixUser3.userId, Integer.valueOf(tRTCMixUser3.f165818x), Integer.valueOf(tRTCMixUser3.f165819y), Integer.valueOf(tRTCMixUser3.width), Integer.valueOf(tRTCMixUser3.height));
                tRTCTranscodingConfig2.mixUsers.add(tRTCMixUser3);
                dVar = this;
                it = it4;
                str2 = str;
            }
        } else if (size == 2) {
            tRTCMixUser2.width = i / 2;
            int i8 = i2 / 4;
            tRTCMixUser2.height = i8;
            int i9 = 0;
            for (C61619b next2 : list) {
                TRTCCloudDef.TRTCMixUser tRTCMixUser4 = new TRTCCloudDef.TRTCMixUser();
                tRTCMixUser4.roomId = str2;
                String str4 = next2.f175221d;
                tRTCMixUser4.userId = str4;
                tRTCMixUser4.streamType = next2.f175222e;
                int i15 = i9 + 1;
                tRTCMixUser4.zOrder = i15;
                tRTCMixUser4.pureAudio = z;
                int i16 = i / 4;
                tRTCMixUser4.width = i16;
                tRTCMixUser4.height = i8;
                tRTCMixUser4.f165818x = i3 + (i9 * i16);
                tRTCMixUser4.f165819y = tRTCMixUser2.height + i4;
                C61626c h2 = dVar.mo86565h(str4, 0);
                if (h2 != null) {
                    tRTCMixUser4.pureAudio = h2.f175256c;
                }
                Log.m105924i("MicroMsg.LiveCoreVisitor", "updateCloudMixtureParams userId " + tRTCMixUser4.userId + ", pureAudioMode: " + tRTCMixUser4.pureAudio + ", userStream: " + h2);
                Log.m105925i("MicroMsg.LiveCoreVisitor", "configRoomPkParams: add mixUser, userId:%s, x:%d, y:%d, width:%d, height:%d", tRTCMixUser4.userId, Integer.valueOf(tRTCMixUser4.f165818x), Integer.valueOf(tRTCMixUser4.f165819y), Integer.valueOf(tRTCMixUser4.width), Integer.valueOf(tRTCMixUser4.height));
                tRTCTranscodingConfig2.mixUsers.add(tRTCMixUser4);
                i8 = i8;
                i9 = i15;
                z = true;
            }
        }
        Log.m105924i("MicroMsg.LiveCoreVisitor", "configRoomPkParams: anchor userId " + tRTCMixUser2.userId + ", pureAudioMode: " + tRTCMixUser2.pureAudio + ", width: " + tRTCMixUser2.width + ", height: " + tRTCMixUser2.height);
    }

    /* renamed from: e */
    public C61619b mo86562e(List<C61619b> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C61619b bVar = list.get(i);
            if (str != null && str.equals(bVar.f175221d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C63714v mo86563f(String str) {
        if (this.f175241g == null || Util.isNullOrNil(str) || !this.f175241g.containsKey(str)) {
            return null;
        }
        return this.f175241g.get(str);
    }

    /* renamed from: g */
    public final int mo86564g(int i, int i2, int i3) {
        int i4;
        float f;
        float f2;
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        boolean z = cVar != null && cVar.mo75199R9();
        if (!z || i3 == 0) {
            i4 = i2;
        } else {
            if (i3 != 1) {
                f2 = (float) (i * 2);
                f = 1.0843374f;
            } else {
                f2 = (float) (i * 2);
                f = 1.2244898f;
            }
            i4 = (int) (f2 / f);
        }
        Log.m105924i("MicroMsg.LiveCoreVisitor", "checkAdjustMicLayout: isEnableMicLayoutChange:" + z + " size = " + i3 + " videoWidth = " + i + " oriVideoHeight = " + i2 + " newHeight = " + i4);
        return i4;
    }

    /* renamed from: h */
    public C61626c mo86565h(String str, int i) {
        String str2;
        Iterator<C61626c> it = this.f175238d.iterator();
        while (it.hasNext()) {
            C61626c next = it.next();
            if (next != null && (str2 = next.f175254a) != null && str2.equals(str) && next.f175255b == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean mo86566i(String str, int i) {
        String str2;
        Iterator<C61626c> it = this.f175238d.iterator();
        while (it.hasNext()) {
            C61626c next = it.next();
            if (next != null && (str2 = next.f175254a) != null && str2.equals(str) && next.f175255b == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public JSONObject mo86567j(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig, boolean z) {
        JSONObject jSONObject;
        String str;
        JSONArray jSONArray;
        int i;
        int i2;
        int i3;
        TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig2 = tRTCTranscodingConfig;
        boolean z2 = z;
        String str2 = DownloadInfo.UID;
        String str3 = "MicroMsg.LiveCoreVisitor";
        if (tRTCTranscodingConfig2 == null) {
            Log.m105924i(str3, "prepareAnchorInfoLinkMicJson return nil, config == null");
            return null;
        }
        ArrayList<TRTCCloudDef.TRTCMixUser> arrayList = tRTCTranscodingConfig2.mixUsers;
        if (arrayList == null) {
            Log.m105924i(str3, "prepareAnchorInfoLinkMicJson return nil, mixUserList == null");
            return null;
        } else if (arrayList.size() <= 1) {
            Log.m105924i(str3, "prepareAnchorInfoLinkMicJson return nil, mixUserList.size: " + arrayList.size());
            return null;
        } else {
            Log.m105924i(str3, "prepareAnchorInfoLinkMicJson isFromMicForce: + " + z2 + " mixUserList.size: " + arrayList.size());
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            try {
                Iterator<TRTCCloudDef.TRTCMixUser> it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    TRTCCloudDef.TRTCMixUser next = it.next();
                    Iterator<TRTCCloudDef.TRTCMixUser> it4 = it;
                    int i5 = 2;
                    if (i4 == 0) {
                        JSONArray jSONArray3 = jSONArray2;
                        String str4 = str2;
                        jSONObject2.putOpt("x", mo86558a(next.f165818x, tRTCTranscodingConfig2.videoWidth));
                        jSONObject2.putOpt("y", mo86558a(next.f165819y, tRTCTranscodingConfig2.videoHeight));
                        jSONObject2.putOpt("w", mo86558a(next.width, tRTCTranscodingConfig2.videoWidth));
                        jSONObject2.putOpt("h", mo86558a(next.height, tRTCTranscodingConfig2.videoHeight));
                        Log.m105924i(str3, "prepareAnchorInfoLinkMicJson: add userInfo, index: " + i4 + ", info:" + jSONObject2);
                        jSONObject2.putOpt("m", Integer.valueOf(z2 ? 1 : 0));
                        if (z2) {
                            String str5 = this.f175247m;
                            if (str5 != null && str5.equals(next.userId)) {
                                i5 = 1;
                            }
                            jSONObject2.putOpt("f", Integer.valueOf(i5));
                            jSONObject2.putOpt("z", Integer.valueOf(next.zOrder));
                        }
                        jSONObject2.putOpt("a", mo86558a(tRTCTranscodingConfig2.videoWidth, tRTCTranscodingConfig2.videoHeight));
                        i4++;
                        jSONObject = jSONObject2;
                        jSONArray = jSONArray3;
                        str = str4;
                    } else {
                        String str6 = str2;
                        JSONArray jSONArray4 = jSONArray2;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject = jSONObject2;
                        str = str6;
                        jSONObject3.putOpt(str, next.userId);
                        String str7 = str3;
                        jSONObject3.putOpt("x", mo86558a(next.f165818x, tRTCTranscodingConfig2.videoWidth));
                        jSONObject3.putOpt("y", mo86558a(next.f165819y, tRTCTranscodingConfig2.videoHeight));
                        jSONObject3.putOpt("w", mo86558a(next.width, tRTCTranscodingConfig2.videoWidth));
                        jSONObject3.putOpt("h", mo86558a(next.height, tRTCTranscodingConfig2.videoHeight));
                        if (z2) {
                            String str8 = this.f175247m;
                            if (str8 != null && str8.equals(next.userId)) {
                                i5 = 1;
                            }
                            jSONObject3.putOpt("f", Integer.valueOf(i5));
                            jSONObject3.putOpt("z", Integer.valueOf(next.zOrder));
                        }
                        C61619b b = C61620c.C61622b.f175234a.mo86554b(next.userId);
                        if (b != null) {
                            if (b.f175225h <= this.f175244j) {
                                Pattern pattern = C61926c.f176038a;
                                i3 = 1;
                            } else {
                                Pattern pattern2 = C61926c.f176038a;
                                i3 = 0;
                            }
                            i = b.f175227j ? i3 | 4 : i3 & -5;
                        } else {
                            i = 0;
                        }
                        C66733d dVar = C66733d.f191763a;
                        boolean a = dVar.mo90764a(next.userId);
                        if (dVar.mo90765b()) {
                            a = next.pureAudio;
                        }
                        if (a) {
                            Pattern pattern3 = C61926c.f176038a;
                            i2 = i | 2;
                        } else {
                            Pattern pattern4 = C61926c.f176038a;
                            i2 = i & -3;
                        }
                        int i6 = next.roomId != null ? i2 | 8 : i2 & -9;
                        String str9 = next.userId;
                        C87412m.m108594g(str9, str);
                        C54407c cVar = C66733d.f191764b;
                        jSONObject3.putOpt("us", Integer.valueOf(cVar != null ? cVar.Ke0(str9) : false ? i6 | 16 : i6 & -17));
                        jSONArray = jSONArray4;
                        jSONArray.put(jSONObject3);
                        str3 = str7;
                        Log.m105924i(str3, "prepareAnchorInfoLinkMicJson: add userInfo, index: " + i4 + ", userInfo:" + jSONObject3);
                        i4++;
                    }
                    jSONArray2 = jSONArray;
                    str2 = str;
                    it = it4;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject4 = jSONObject2;
                jSONObject4.putOpt("list", jSONArray2);
                return jSONObject4;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* renamed from: k */
    public void mo86568k(String str, int i, TXCloudVideoView tXCloudVideoView) {
        C61626c cVar = new C61626c();
        cVar.f175254a = str;
        cVar.f175255b = i;
        cVar.f175256c = false;
        if (C61620c.C61622b.f175234a.mo86554b(str) == null) {
            C61620c.C61622b.f175234a.mo86553a(new C61619b(str, i));
        }
        if (i == 2 || !this.f175237c) {
            if (tXCloudVideoView != null) {
                this.f175236b.setDebugViewMargin(str, new TRTCCloud.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f));
                if (i == 0) {
                    this.f175236b.setRemoteViewFillMode(str, 1);
                    this.f175236b.startRemoteView(str, tXCloudVideoView);
                } else if (i == 2) {
                    this.f175236b.setRemoteSubStreamViewFillMode(str, 1);
                    this.f175236b.startRemoteSubStreamView(str, tXCloudVideoView);
                }
            }
        } else if (tXCloudVideoView == null) {
            Log.m105920e("MicroMsg.LiveCoreVisitor", "startCustomRender renderView = null");
        } else {
            C63714v f = mo86563f(str);
            if (f == null) {
                f = new C63714v(str, 0);
            }
            TextureView textureView = new TextureView(tXCloudVideoView.getContext());
            textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            tXCloudVideoView.addVideoView(textureView);
            textureView.setSurfaceTextureListener(new C61627e(this, f));
            this.f175236b.setRemoteVideoRenderListener(str, 1, 2, f);
            this.f175241g.put(str, f);
            this.f175236b.startRemoteView(str, (TXCloudVideoView) null);
            textureView.invalidate();
        }
        if (!mo86566i(str, 0)) {
            this.f175238d.add(cVar);
            Log.m105924i("MicroMsg.LiveCoreVisitor", "remoteUserVideoAvailable " + cVar.f175254a + ", stream " + 0 + ", size " + this.f175238d.size());
        }
    }

    /* renamed from: l */
    public final void mo86569l(String str, int i) {
        Iterator<C61626c> it = this.f175238d.iterator();
        while (it.hasNext()) {
            C61626c next = it.next();
            String str2 = next.f175254a;
            if (str2 != null && str2.equals(str) && next.f175255b == i) {
                it.remove();
                Log.m105924i("MicroMsg.LiveCoreVisitor", "removeVideoStream " + str + ", stream " + i + ", size " + this.f175238d.size());
                return;
            }
        }
    }

    /* renamed from: m */
    public final void mo86570m(String str) {
        C63714v remove = this.f175241g.remove(str);
        if (remove != null) {
            remove.mo88555a(new C63721y(remove));
        }
        this.f175236b.stopRemoteSubStreamView(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (r1.mo85947d().f174723s == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0147, code lost:
        if (r1.mo85947d().f174723s == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014e, code lost:
        r6 = 90;
        r9 = 160;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86571n() {
        /*
            r24 = this;
            r0 = r24
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174721q
            if (r2 != 0) goto L_0x0011
            r2 = 1280(0x500, float:1.794E-42)
            r5 = 720(0x2d0, float:1.009E-42)
            goto L_0x0015
        L_0x0011:
            r2 = 720(0x2d0, float:1.009E-42)
            r5 = 1280(0x500, float:1.794E-42)
        L_0x0015:
            m50.e r6 = r1.mo85947d()
            boolean r6 = r6.f174723s
            r7 = 180(0xb4, float:2.52E-43)
            r8 = 320(0x140, float:4.48E-43)
            if (r6 != 0) goto L_0x0026
            r6 = 320(0x140, float:4.48E-43)
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x002a
        L_0x0026:
            r6 = 180(0xb4, float:2.52E-43)
            r9 = 320(0x140, float:4.48E-43)
        L_0x002a:
            r11 = 50
            r12 = 15
            m50.e r13 = r1.mo85947d()
            int r13 = r13.f174711d
            r14 = 1500(0x5dc, float:2.102E-42)
            r15 = 128(0x80, float:1.794E-43)
            r3 = 3
            r17 = 480(0x1e0, float:6.73E-43)
            r18 = 160(0xa0, float:2.24E-43)
            if (r13 == r3) goto L_0x0196
            r4 = 7
            if (r13 == r4) goto L_0x017c
            r4 = 56
            r20 = 96
            r21 = 54
            if (r13 == r4) goto L_0x0155
            r4 = 62
            r22 = 90
            r23 = 640(0x280, float:8.97E-43)
            if (r13 == r4) goto L_0x0130
            r4 = 104(0x68, float:1.46E-43)
            if (r13 == r4) goto L_0x0109
            r4 = 108(0x6c, float:1.51E-43)
            if (r13 == r4) goto L_0x00ed
            r4 = 110(0x6e, float:1.54E-43)
            if (r13 == r4) goto L_0x00bb
            r4 = 112(0x70, float:1.57E-43)
            if (r13 == r4) goto L_0x0096
            r4 = 114(0x72, float:1.6E-43)
            if (r13 == r4) goto L_0x0068
            goto L_0x01b3
        L_0x0068:
            r2 = 1088(0x440, float:1.525E-42)
            r4 = 1920(0x780, float:2.69E-42)
            m50.e r5 = r1.mo85947d()
            boolean r5 = r5.f174721q
            if (r5 != 0) goto L_0x007b
            r2 = 1920(0x780, float:2.69E-42)
            r4 = 1088(0x440, float:1.525E-42)
            r5 = 1088(0x440, float:1.525E-42)
            goto L_0x007d
        L_0x007b:
            r5 = 1920(0x780, float:2.69E-42)
        L_0x007d:
            r4 = 272(0x110, float:3.81E-43)
            m50.e r6 = r1.mo85947d()
            boolean r6 = r6.f174723s
            if (r6 != 0) goto L_0x008e
            r4 = 272(0x110, float:3.81E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r9 = 272(0x110, float:3.81E-43)
            goto L_0x0092
        L_0x008e:
            r6 = 272(0x110, float:3.81E-43)
            r9 = 480(0x1e0, float:6.73E-43)
        L_0x0092:
            r14 = 1900(0x76c, float:2.662E-42)
            goto L_0x01b3
        L_0x0096:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174721q
            if (r2 != 0) goto L_0x00a3
            r16 = 1280(0x500, float:1.794E-42)
            r19 = 720(0x2d0, float:1.009E-42)
            goto L_0x00a7
        L_0x00a3:
            r16 = 720(0x2d0, float:1.009E-42)
            r19 = 1280(0x500, float:1.794E-42)
        L_0x00a7:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174723s
            if (r2 != 0) goto L_0x00b3
            r7 = 320(0x140, float:4.48E-43)
            r8 = 180(0xb4, float:2.52E-43)
        L_0x00b3:
            r6 = r7
            r9 = r8
            r2 = r16
            r5 = r19
            goto L_0x01b3
        L_0x00bb:
            r2 = 544(0x220, float:7.62E-43)
            r4 = 960(0x3c0, float:1.345E-42)
            m50.e r5 = r1.mo85947d()
            boolean r5 = r5.f174721q
            if (r5 != 0) goto L_0x00ce
            r2 = 960(0x3c0, float:1.345E-42)
            r4 = 544(0x220, float:7.62E-43)
            r5 = 544(0x220, float:7.62E-43)
            goto L_0x00d0
        L_0x00ce:
            r5 = 960(0x3c0, float:1.345E-42)
        L_0x00d0:
            r4 = 171(0xab, float:2.4E-43)
            r6 = 304(0x130, float:4.26E-43)
            m50.e r7 = r1.mo85947d()
            boolean r7 = r7.f174723s
            if (r7 != 0) goto L_0x00e5
            r4 = 304(0x130, float:4.26E-43)
            r6 = 171(0xab, float:2.4E-43)
            r6 = 304(0x130, float:4.26E-43)
            r9 = 171(0xab, float:2.4E-43)
            goto L_0x00e9
        L_0x00e5:
            r6 = 171(0xab, float:2.4E-43)
            r9 = 304(0x130, float:4.26E-43)
        L_0x00e9:
            r14 = 1000(0x3e8, float:1.401E-42)
            goto L_0x01b3
        L_0x00ed:
            r2 = 368(0x170, float:5.16E-43)
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174721q
            if (r4 != 0) goto L_0x00fe
            r2 = 368(0x170, float:5.16E-43)
            r2 = 640(0x280, float:8.97E-43)
            r5 = 368(0x170, float:5.16E-43)
            goto L_0x0100
        L_0x00fe:
            r5 = 640(0x280, float:8.97E-43)
        L_0x0100:
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174723s
            if (r4 != 0) goto L_0x014e
            goto L_0x0149
        L_0x0109:
            r2 = 336(0x150, float:4.71E-43)
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174721q
            r5 = 192(0xc0, float:2.69E-43)
            if (r4 != 0) goto L_0x0118
            r2 = 336(0x150, float:4.71E-43)
            goto L_0x011c
        L_0x0118:
            r2 = 192(0xc0, float:2.69E-43)
            r5 = 336(0x150, float:4.71E-43)
        L_0x011c:
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174723s
            if (r4 != 0) goto L_0x0129
            r6 = 96
            r9 = 54
            goto L_0x012d
        L_0x0129:
            r6 = 54
            r9 = 96
        L_0x012d:
            r11 = 30
            goto L_0x0179
        L_0x0130:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174721q
            if (r2 != 0) goto L_0x013d
            r2 = 640(0x280, float:8.97E-43)
            r5 = 480(0x1e0, float:6.73E-43)
            goto L_0x0141
        L_0x013d:
            r2 = 480(0x1e0, float:6.73E-43)
            r5 = 640(0x280, float:8.97E-43)
        L_0x0141:
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174723s
            if (r4 != 0) goto L_0x014e
        L_0x0149:
            r6 = 160(0xa0, float:2.24E-43)
            r9 = 90
            goto L_0x0152
        L_0x014e:
            r6 = 90
            r9 = 160(0xa0, float:2.24E-43)
        L_0x0152:
            r14 = 800(0x320, float:1.121E-42)
            goto L_0x01b3
        L_0x0155:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174721q
            r4 = 240(0xf0, float:3.36E-43)
            if (r2 != 0) goto L_0x0164
            r2 = 320(0x140, float:4.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            goto L_0x0168
        L_0x0164:
            r2 = 240(0xf0, float:3.36E-43)
            r5 = 320(0x140, float:4.48E-43)
        L_0x0168:
            m50.e r4 = r1.mo85947d()
            boolean r4 = r4.f174723s
            if (r4 != 0) goto L_0x0175
            r6 = 96
            r9 = 54
            goto L_0x0179
        L_0x0175:
            r6 = 54
            r9 = 96
        L_0x0179:
            r14 = 400(0x190, float:5.6E-43)
            goto L_0x01b3
        L_0x017c:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174723s
            r4 = 72
            if (r2 != 0) goto L_0x018b
            r6 = 128(0x80, float:1.794E-43)
            r9 = 72
            goto L_0x018f
        L_0x018b:
            r6 = 72
            r9 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r14 = 600(0x258, float:8.41E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r5 = 480(0x1e0, float:6.73E-43)
            goto L_0x01b3
        L_0x0196:
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174723s
            r4 = 48
            r5 = 27
            if (r2 != 0) goto L_0x01a7
            r6 = 48
            r9 = 27
            goto L_0x01ab
        L_0x01a7:
            r6 = 27
            r9 = 48
        L_0x01ab:
            r11 = 20
            r14 = 200(0xc8, float:2.8E-43)
            r2 = 160(0xa0, float:2.24E-43)
            r5 = 160(0xa0, float:2.24E-43)
        L_0x01b3:
            m50.e r4 = r1.mo85947d()
            int r4 = r4.f174713f
            if (r4 <= 0) goto L_0x01bc
            r14 = r4
        L_0x01bc:
            m50.e r4 = r1.mo85947d()
            int r4 = r4.f174712e
            if (r4 <= 0) goto L_0x01c5
            r12 = r4
        L_0x01c5:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r13 = 1
            r4[r13] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r10 = 2
            r4[r10] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4[r3] = r7
            java.lang.String r7 = "MicroMsg.LiveCoreVisitor"
            java.lang.String r8 = "videoWidth:%s, videoHeight:%s, bitrate:%s, fps:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig r4 = new com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig
            r4.<init>()
            int r8 = r0.f175242h
            r4.appId = r8
            int r8 = r0.f175243i
            r4.bizId = r8
            r4.videoWidth = r2
            r4.videoHeight = r5
            r4.videoGOP = r13
            r4.videoFramerate = r12
            r4.videoBitrate = r14
            r8 = 48000(0xbb80, float:6.7262E-41)
            r4.audioSampleRate = r8
            r8 = 64
            r4.audioBitrate = r8
            m50.a r8 = r1.mo85944a()
            int r8 = r8.f174703f
            if (r8 != r3) goto L_0x0215
            r4.audioBitrate = r15
        L_0x0215:
            r4.audioChannels = r10
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r8 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r8.<init>()
            java.lang.String r12 = r0.f175239e
            r8.userId = r12
            r12 = 0
            r8.zOrder = r12
            r8.f165818x = r12
            r8.f165819y = r12
            r8.width = r2
            r8.height = r5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r4.mixUsers = r12
            r12.add(r8)
            m50.e r1 = r1.mo85947d()
            boolean r1 = r1.f174722r
            if (r1 == 0) goto L_0x02f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "updateCloudMixtureParams videostreams: "
            r1.append(r8)
            java.util.ArrayList<n50.d$c> r8 = r0.f175238d
            int r8 = r8.size()
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            n50.c r1 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r1 = r1.f175229a
            if (r1 == 0) goto L_0x02f9
            java.util.Iterator r1 = r1.iterator()
            r8 = 0
        L_0x0263:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x02f9
            java.lang.Object r12 = r1.next()
            n50.b r12 = (n50.C61619b) r12
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r14 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r14.<init>()
            k50.a r15 = k50.C60971a.C60973b.f173670a
            m50.d r15 = r15.mo85946c()
            boolean r10 = r15.f174707f
            if (r10 == 0) goto L_0x028c
            java.lang.String r10 = r12.f175221d
            java.lang.String r3 = r15.f174706e
            boolean r3 = r10.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x028c
            java.lang.String r3 = r15.f174705d
            r14.roomId = r3
        L_0x028c:
            java.lang.String r3 = r12.f175221d
            r14.userId = r3
            int r10 = r12.f175222e
            r14.streamType = r10
            int r10 = r8 + 1
            r14.zOrder = r10
            r14.pureAudio = r13
            r12 = 0
            n50.d$c r3 = r0.mo86565h(r3, r12)
            if (r3 == 0) goto L_0x02cd
            boolean r3 = r3.f175256c
            r14.pureAudio = r3
            r3 = 3
            if (r8 >= r3) goto L_0x02b8
            r12 = 5
            int r15 = r2 + -5
            int r15 = r15 - r6
            r14.f165818x = r15
            int r8 = r8 * r9
            int r8 = r8 + r11
            r14.f165819y = r8
            r14.width = r6
            r14.height = r9
            goto L_0x02cf
        L_0x02b8:
            r12 = 5
            r15 = 6
            if (r8 >= r15) goto L_0x02cf
            r14.f165818x = r12
            int r15 = r5 - r11
            int r8 = r8 + -3
            int r8 = r8 * r9
            int r15 = r15 - r8
            int r15 = r15 - r9
            r14.f165819y = r15
            r14.width = r6
            r14.height = r9
            goto L_0x02cf
        L_0x02cd:
            r3 = 3
            r12 = 5
        L_0x02cf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "updateCloudMixtureParams userId "
            r8.append(r15)
            java.lang.String r15 = r14.userId
            r8.append(r15)
            java.lang.String r15 = ", pureAudioMode: "
            r8.append(r15)
            boolean r15 = r14.pureAudio
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r8 = r4.mixUsers
            r8.add(r14)
            r8 = r10
            r10 = 2
            goto L_0x0263
        L_0x02f9:
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174724t
            m50.e r1 = r1.mo85947d()
            boolean r1 = r1.f174725u
            if (r2 == 0) goto L_0x030e
            if (r1 == 0) goto L_0x030e
            r3 = 2
            r12 = 1
            goto L_0x0310
        L_0x030e:
            r3 = 2
            r12 = 0
        L_0x0310:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r6 = 0
            r5[r6] = r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5[r13] = r1
            java.lang.String r1 = "cloudmixing,is265:%b, forceMixing:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r5)
            if (r12 != 0) goto L_0x033d
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r1 = r4.mixUsers
            if (r1 == 0) goto L_0x0331
            int r1 = r1.size()
            if (r1 <= r13) goto L_0x0331
            goto L_0x033d
        L_0x0331:
            com.tencent.trtc.TRTCCloud r1 = r0.f175236b
            r2 = 0
            r1.setMixTranscodingConfig(r2)
            java.lang.String r1 = "cancel cloudmixturing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x0353
        L_0x033d:
            com.tencent.trtc.TRTCCloud r1 = r0.f175236b
            r1.setMixTranscodingConfig(r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r13] = r2
            java.lang.String r2 = "do cloudmixturing, config:%s, is265:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
        L_0x0353:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.C61623d.mo86571n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x09a5  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0ab8  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0adc  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0ae7  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x059f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x064e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0706 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86572o(boolean r25) {
        /*
            r24 = this;
            r8 = r24
            n50.c r0 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r0 = r0.f175229a
            int r1 = r8.f175248n
            r9 = 2
            r10 = 1
            if (r1 != r9) goto L_0x0014
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0014
            r8.f175248n = r10
        L_0x0014:
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.d r1 = r0.mo85946c()
            boolean r1 = r1.f174708g
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0024
            r8.f175248n = r10
            r8.f175247m = r2
        L_0x0024:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            r3 = 1280(0x500, float:1.794E-42)
            r4 = 720(0x2d0, float:1.009E-42)
            if (r1 != 0) goto L_0x0035
            r1 = 1280(0x500, float:1.794E-42)
            r5 = 720(0x2d0, float:1.009E-42)
            goto L_0x0039
        L_0x0035:
            r1 = 720(0x2d0, float:1.009E-42)
            r5 = 1280(0x500, float:1.794E-42)
        L_0x0039:
            m50.e r6 = r0.mo85947d()
            int r6 = r6.f174711d
            r7 = 800(0x320, float:1.121E-42)
            r11 = 7
            r13 = 160(0xa0, float:2.24E-43)
            r14 = 480(0x1e0, float:6.73E-43)
            r15 = 640(0x280, float:8.97E-43)
            r12 = 3
            if (r6 == r12) goto L_0x0100
            if (r6 == r11) goto L_0x00f9
            r13 = 56
            r17 = 336(0x150, float:4.71E-43)
            r18 = 320(0x140, float:4.48E-43)
            r19 = 240(0xf0, float:3.36E-43)
            r20 = 192(0xc0, float:2.69E-43)
            if (r6 == r13) goto L_0x00e3
            r13 = 62
            if (r6 == r13) goto L_0x00d4
            r13 = 104(0x68, float:1.46E-43)
            if (r6 == r13) goto L_0x00c4
            r13 = 108(0x6c, float:1.51E-43)
            if (r6 == r13) goto L_0x00b4
            r7 = 110(0x6e, float:1.54E-43)
            if (r6 == r7) goto L_0x009e
            r7 = 112(0x70, float:1.57E-43)
            if (r6 == r7) goto L_0x0089
            r3 = 114(0x72, float:1.6E-43)
            if (r6 == r3) goto L_0x0072
            goto L_0x0098
        L_0x0072:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            r3 = 1088(0x440, float:1.525E-42)
            r4 = 1920(0x780, float:2.69E-42)
            if (r1 != 0) goto L_0x0081
            r13 = 1920(0x780, float:2.69E-42)
            goto L_0x0085
        L_0x0081:
            r3 = 1920(0x780, float:2.69E-42)
            r13 = 1088(0x440, float:1.525E-42)
        L_0x0085:
            r7 = 1900(0x76c, float:2.662E-42)
            goto L_0x0104
        L_0x0089:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            if (r1 != 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            r3 = 720(0x2d0, float:1.009E-42)
            r4 = 1280(0x500, float:1.794E-42)
        L_0x0096:
            r1 = r3
            r5 = r4
        L_0x0098:
            r7 = 1500(0x5dc, float:2.102E-42)
            r13 = r1
            r3 = r5
            goto L_0x0104
        L_0x009e:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            r3 = 960(0x3c0, float:1.345E-42)
            r4 = 544(0x220, float:7.62E-43)
            if (r1 != 0) goto L_0x00af
            r3 = 544(0x220, float:7.62E-43)
            r13 = 960(0x3c0, float:1.345E-42)
            goto L_0x00b1
        L_0x00af:
            r13 = 544(0x220, float:7.62E-43)
        L_0x00b1:
            r7 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0104
        L_0x00b4:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            if (r1 != 0) goto L_0x00c1
            r3 = 368(0x170, float:5.16E-43)
            r13 = 640(0x280, float:8.97E-43)
            goto L_0x0104
        L_0x00c1:
            r14 = 368(0x170, float:5.16E-43)
            goto L_0x00df
        L_0x00c4:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            if (r1 != 0) goto L_0x00d1
            r13 = 336(0x150, float:4.71E-43)
            r17 = 192(0xc0, float:2.69E-43)
            goto L_0x00f4
        L_0x00d1:
            r13 = 192(0xc0, float:2.69E-43)
            goto L_0x00f4
        L_0x00d4:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            if (r1 != 0) goto L_0x00df
            r13 = 640(0x280, float:8.97E-43)
            goto L_0x00fd
        L_0x00df:
            r13 = r14
            r3 = 640(0x280, float:8.97E-43)
            goto L_0x0104
        L_0x00e3:
            m50.e r1 = r0.mo85947d()
            boolean r1 = r1.f174721q
            if (r1 != 0) goto L_0x00f0
            r13 = 320(0x140, float:4.48E-43)
            r17 = 240(0xf0, float:3.36E-43)
            goto L_0x00f4
        L_0x00f0:
            r13 = 240(0xf0, float:3.36E-43)
            r17 = 320(0x140, float:4.48E-43)
        L_0x00f4:
            r7 = 400(0x190, float:5.6E-43)
            r3 = r17
            goto L_0x0104
        L_0x00f9:
            r7 = 600(0x258, float:8.41E-43)
            r13 = 480(0x1e0, float:6.73E-43)
        L_0x00fd:
            r3 = 480(0x1e0, float:6.73E-43)
            goto L_0x0104
        L_0x0100:
            r7 = 200(0xc8, float:2.8E-43)
            r3 = 160(0xa0, float:2.24E-43)
        L_0x0104:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            int r15 = r1.intValue()
            int r1 = r3.intValue()
            int r3 = r4.intValue()
            r4 = 15
            m50.e r5 = r0.mo85947d()
            int r5 = r5.f174713f
            if (r5 <= 0) goto L_0x0127
            r3 = r5
        L_0x0127:
            m50.e r5 = r0.mo85947d()
            int r5 = r5.f174712e
            if (r5 <= 0) goto L_0x0130
            r4 = r5
        L_0x0130:
            d50.i r5 = r8.f175246l
            r14 = 0
            if (r5 == 0) goto L_0x013e
            boolean r5 = r5.mo82880b()
            if (r5 == 0) goto L_0x013e
            r19 = 1
            goto L_0x0140
        L_0x013e:
            r19 = 0
        L_0x0140:
            d50.i r5 = r8.f175246l
            if (r5 == 0) goto L_0x014b
            boolean r5 = r5.f166264k
            if (r5 == 0) goto L_0x014b
            r20 = 1
            goto L_0x014d
        L_0x014b:
            r20 = 0
        L_0x014d:
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6[r14] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r10] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r12] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r19)
            r13 = 4
            r6[r13] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r20)
            r11 = 5
            r6[r11] = r7
            java.lang.String r7 = "MicroMsg.LiveCoreVisitor"
            java.lang.String r11 = "videoWidth:%s, videoHeight:%s, bitrate:%s, fps:%s, audioMode:%s, isScreenShareMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r6)
            com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig r11 = new com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig
            r11.<init>()
            int r6 = r8.f175242h
            r11.appId = r6
            int r6 = r8.f175243i
            r11.bizId = r6
            r11.videoWidth = r15
            r11.videoHeight = r1
            r11.videoGOP = r10
            r11.videoFramerate = r4
            r11.videoBitrate = r3
            r3 = 48000(0xbb80, float:6.7262E-41)
            r11.audioSampleRate = r3
            r3 = 64
            r11.audioBitrate = r3
            m50.a r3 = r0.mo85944a()
            int r3 = r3.f174703f
            if (r3 != r12) goto L_0x01aa
            r3 = 128(0x80, float:1.794E-43)
            r11.audioBitrate = r3
        L_0x01aa:
            r11.audioChannels = r9
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r6 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r6.<init>()
            java.lang.String r3 = r8.f175239e
            r6.userId = r3
            r6.zOrder = r14
            r6.f165818x = r14
            r6.f165819y = r14
            r6.width = r15
            r6.height = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11.mixUsers = r3
            r3.add(r6)
            if (r19 == 0) goto L_0x01cf
            java.lang.String r3 = "538"
            r11.backgroundImage = r3
        L_0x01cf:
            r4 = 0
            r8.f175252r = r4
            n50.c r3 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r3 = r3.f175229a
            if (r3 != 0) goto L_0x01db
            r18 = 1
            goto L_0x01dd
        L_0x01db:
            r18 = 0
        L_0x01dd:
            int r3 = r3.size()
            if (r3 != 0) goto L_0x01e5
            r3 = 1
            goto L_0x01e6
        L_0x01e5:
            r3 = 0
        L_0x01e6:
            r3 = r18 | r3
            if (r3 == 0) goto L_0x01f1
            java.lang.String r3 = "checkResetCurFocusUserId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            r8.f175247m = r2
        L_0x01f1:
            m50.e r3 = r0.mo85947d()
            boolean r3 = r3.f174722r
            if (r3 == 0) goto L_0x096a
            z40.d r3 = z40.C66733d.f191763a
            boolean r3 = r3.mo90766c()
            if (r3 == 0) goto L_0x031d
            n50.c r0 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r0 = r0.f175229a
            if (r0 == 0) goto L_0x0258
            r6.f165818x = r14
            r6.f165819y = r14
            r6.width = r15
            r6.height = r1
            r11.videoWidth = r15
            r11.videoHeight = r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0217:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0258
            java.lang.Object r1 = r0.next()
            n50.b r1 = (n50.C61619b) r1
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r2.<init>()
            java.lang.String r3 = r1.f175221d
            r2.userId = r3
            int r1 = r1.f175222e
            r2.streamType = r1
            r2.pureAudio = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "micIntercomFillConfig userId "
            r1.append(r3)
            java.lang.String r3 = r2.userId
            r1.append(r3)
            java.lang.String r3 = ", pureAudioMode: "
            r1.append(r3)
            boolean r3 = r2.pureAudio
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r1 = r11.mixUsers
            r1.add(r2)
            goto L_0x0217
        L_0x0258:
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r0 = r11.mixUsers
            if (r0 != 0) goto L_0x0262
            java.lang.String r0 = "prepareAnchorMicIntercomJson return nil, mixUserList == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0280
        L_0x0262:
            int r1 = r0.size()
            if (r1 > r10) goto L_0x0283
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prepareAnchorMicIntercomJson return nil, mixUserList.size: "
            r1.append(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0280:
            r1 = r4
            goto L_0x0315
        L_0x0283:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x0315 }
            r2 = 0
        L_0x028d:
            boolean r3 = r0.hasNext()     // Catch:{ JSONException -> 0x0315 }
            if (r3 == 0) goto L_0x0315
            java.lang.Object r3 = r0.next()     // Catch:{ JSONException -> 0x0315 }
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r3 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r3     // Catch:{ JSONException -> 0x0315 }
            if (r2 != 0) goto L_0x029d
            goto L_0x030f
        L_0x029d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0315 }
            r5.<init>()     // Catch:{ JSONException -> 0x0315 }
            java.lang.String r15 = "uId"
            java.lang.String r4 = r3.userId     // Catch:{ JSONException -> 0x0315 }
            r5.putOpt(r15, r4)     // Catch:{ JSONException -> 0x0315 }
            n50.c r4 = n50.C61620c.C61622b.f175234a     // Catch:{ JSONException -> 0x0315 }
            java.lang.String r15 = r3.userId     // Catch:{ JSONException -> 0x0315 }
            n50.b r4 = r4.mo86554b(r15)     // Catch:{ JSONException -> 0x0315 }
            if (r4 == 0) goto L_0x02cb
            int r15 = r4.f175225h     // Catch:{ JSONException -> 0x0315 }
            int r13 = r8.f175244j     // Catch:{ JSONException -> 0x0315 }
            if (r15 > r13) goto L_0x02be
            java.util.regex.Pattern r13 = o40.C61926c.f176038a     // Catch:{ JSONException -> 0x0315 }
            r13 = 1
            goto L_0x02c1
        L_0x02be:
            java.util.regex.Pattern r13 = o40.C61926c.f176038a     // Catch:{ JSONException -> 0x0315 }
            r13 = 0
        L_0x02c1:
            boolean r4 = r4.f175227j     // Catch:{ JSONException -> 0x0315 }
            if (r4 == 0) goto L_0x02c8
            r4 = r13 | 4
            goto L_0x02cc
        L_0x02c8:
            r4 = r13 & -5
            goto L_0x02cc
        L_0x02cb:
            r4 = 0
        L_0x02cc:
            d50.i r13 = r8.f175246l     // Catch:{ JSONException -> 0x0315 }
            boolean r13 = r13.mo82880b()     // Catch:{ JSONException -> 0x0315 }
            if (r13 == 0) goto L_0x02d9
            java.util.regex.Pattern r13 = o40.C61926c.f176038a     // Catch:{ JSONException -> 0x0315 }
            r4 = r4 | 2
            goto L_0x02dd
        L_0x02d9:
            java.util.regex.Pattern r13 = o40.C61926c.f176038a     // Catch:{ JSONException -> 0x0315 }
            r4 = r4 & -3
        L_0x02dd:
            java.lang.String r3 = r3.roomId     // Catch:{ JSONException -> 0x0315 }
            if (r3 == 0) goto L_0x02e4
            r3 = r4 | 8
            goto L_0x02e6
        L_0x02e4:
            r3 = r4 & -9
        L_0x02e6:
            java.lang.String r4 = "us"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x0315 }
            r5.putOpt(r4, r3)     // Catch:{ JSONException -> 0x0315 }
            r1.put(r5)     // Catch:{ JSONException -> 0x0315 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0315 }
            r3.<init>()     // Catch:{ JSONException -> 0x0315 }
            java.lang.String r4 = "prepareAnchorMicIntercomJson: add userInfo, index: "
            r3.append(r4)     // Catch:{ JSONException -> 0x0315 }
            r3.append(r2)     // Catch:{ JSONException -> 0x0315 }
            java.lang.String r4 = ", userInfo:"
            r3.append(r4)     // Catch:{ JSONException -> 0x0315 }
            r3.append(r5)     // Catch:{ JSONException -> 0x0315 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0315 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)     // Catch:{ JSONException -> 0x0315 }
        L_0x030f:
            int r2 = r2 + 1
            r4 = 0
            r13 = 4
            goto L_0x028d
        L_0x0315:
            r8.f175252r = r1
            r12 = r6
            r10 = r7
            r0 = 0
            r4 = 0
            goto L_0x096f
        L_0x031d:
            m50.d r0 = r0.mo85946c()
            boolean r3 = r0.f174708g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "updateCloudMixtureParamsForFinder: isRoomPk = "
            r4.append(r13)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            if (r3 == 0) goto L_0x04d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "updateCloudMixtureParamsForFinder videostreams: "
            r0.append(r2)
            java.util.ArrayList<n50.d$c> r2 = r8.f175238d
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            n50.c r0 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r0 = r0.f175229a
            if (r0 == 0) goto L_0x04c5
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x04c5
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r5 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0374:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0454
            java.lang.Object r4 = r3.next()
            n50.b r4 = (n50.C61619b) r4
            java.lang.String r9 = r4.f175226i
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0416
            n50.c r9 = n50.C61620c.C61622b.f175234a
            java.lang.String r12 = r9.f175233e
            if (r12 == 0) goto L_0x0399
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, n50.b>> r9 = r9.f175232d
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            java.lang.Object r9 = r9.get(r12)
            java.util.Map r9 = (java.util.Map) r9
            goto L_0x039a
        L_0x0399:
            r9 = 0
        L_0x039a:
            if (r9 == 0) goto L_0x03f1
            java.lang.String r10 = r4.f175221d
            boolean r10 = r9.containsKey(r10)
            if (r10 == 0) goto L_0x03f1
            java.lang.String r10 = r4.f175221d
            java.lang.Object r10 = r9.get(r10)
            if (r10 != 0) goto L_0x03ad
            goto L_0x03f1
        L_0x03ad:
            java.lang.String r10 = r4.f175221d
            java.lang.Object r9 = r9.get(r10)
            n50.b r9 = (n50.C61619b) r9
            java.lang.String r10 = r9.f175226i
            r4.f175226i = r10
            boolean r10 = r9.f175227j
            r4.f175227j = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "updateCloudMixtureParamsForFinder: read from cache for userId:"
            r10.append(r14)
            java.lang.String r14 = r4.f175221d
            r10.append(r14)
            java.lang.String r14 = ", sessionId:"
            r10.append(r14)
            r10.append(r12)
            java.lang.String r12 = ", roomId:"
            r10.append(r12)
            java.lang.String r12 = r9.f175226i
            r10.append(r12)
            java.lang.String r12 = ", isAnchor:"
            r10.append(r12)
            boolean r9 = r9.f175227j
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            goto L_0x0416
        L_0x03f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateCloudMixtureParamsForFinder: roomId is empty for userId:"
            r0.append(r1)
            java.lang.String r1 = r4.f175221d
            r0.append(r1)
            java.lang.String r1 = ", sessionId:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", abort for waiting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        L_0x0416:
            java.lang.String r9 = r4.f175226i
            java.lang.String r10 = r8.f175240f
            boolean r9 = android.text.TextUtils.equals(r9, r10)
            if (r9 == 0) goto L_0x0424
            r2.add(r4)
            goto L_0x044e
        L_0x0424:
            boolean r9 = r4.f175227j
            if (r9 == 0) goto L_0x044b
            java.lang.String r9 = r4.f175221d
            r5.userId = r9
            r10 = 0
            r5.zOrder = r10
            java.lang.String r10 = r4.f175226i
            r5.roomId = r10
            int r4 = r4.f175222e
            r5.streamType = r4
            r4 = 1
            r5.pureAudio = r4
            r4 = 0
            n50.d$c r9 = r8.mo86565h(r9, r4)
            if (r9 == 0) goto L_0x0445
            boolean r4 = r9.f175256c
            r5.pureAudio = r4
        L_0x0445:
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r4 = r11.mixUsers
            r4.add(r5)
            goto L_0x044e
        L_0x044b:
            r13.add(r4)
        L_0x044e:
            r9 = 2
            r10 = 1
            r12 = 3
            r14 = 0
            goto L_0x0374
        L_0x0454:
            int r3 = r2.size()
            int r4 = r13.size()
            java.lang.String r9 = r8.mo86560c(r3, r4)
            r11.backgroundImage = r9
            r11.videoWidth = r15
            int r0 = r0.size()
            int r9 = r8.mo86564g(r15, r1, r0)
            int r0 = r9 / 2
            r11.videoHeight = r0
            int r0 = r3 + r4
            r1 = 1
            if (r0 < r1) goto L_0x0478
            r0 = 3
            r10 = 0
            goto L_0x047a
        L_0x0478:
            r0 = 3
            r10 = 1
        L_0x047a:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r12[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r12[r1] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1 = 2
            r12[r1] = r0
            java.lang.String r0 = "updateCloudMixtureParamsForFinder: selfRoomSize:%d, otherRoomSize:%d, canSendPreviousSei:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r12)
            r4 = 0
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>(r3, r3)
            r0 = r24
            r1 = r2
            r2 = r6
            r3 = r11
            r14 = 0
            r14 = r5
            r5 = r12
            r12 = r6
            r6 = r15
            r16 = r10
            r10 = r7
            r7 = r9
            r0.mo86561d(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r4 = r14.roomId
            android.graphics.Point r5 = new android.graphics.Point
            int r0 = r15 / 2
            r7 = 0
            r5.<init>(r0, r7)
            r0 = r24
            r1 = r13
            r2 = r14
            r13 = 0
            r7 = r9
            r0.mo86561d(r1, r2, r3, r4, r5, r6, r7)
            org.json.JSONObject r4 = r8.mo86567j(r11, r13)
            goto L_0x04d0
        L_0x04c5:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "updateCloudMixtureParamsForFinder: remoteUserConfigList is null or size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r4 = 0
            r16 = 1
        L_0x04d0:
            r14 = r16
            r0 = 0
            goto L_0x096f
        L_0x04d5:
            r12 = r6
            r10 = r7
            int r3 = r8.f175248n
            r4 = 2
            if (r3 == r4) goto L_0x094a
            r4 = 3
            if (r3 == r4) goto L_0x0829
            r4 = 4
            if (r3 == r4) goto L_0x0807
            n50.a r3 = r8.f175245k
            r3.mo86543a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "normalMicModeFillConfig videostreams: "
            r3.append(r4)
            java.util.ArrayList<n50.d$c> r4 = r8.f175238d
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            n50.c r3 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r3 = r3.f175229a
            int r4 = r3.size()
            int r4 = r8.mo86564g(r15, r1, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "normalMicModeFillConfig oriVideoHeight: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " newHeight: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            int r6 = r3.size()
            java.lang.String r7 = ", userStream: "
            java.lang.String r9 = ", pureAudioMode: "
            java.lang.String r13 = "normalMicModeFillConfig userId "
            r14 = 1
            if (r6 != r14) goto L_0x05cf
            r14 = 0
            r12.f165818x = r14
            r12.f165819y = r14
            int r1 = r15 / 2
            r12.width = r1
            r5 = 2
            int r4 = r4 / r5
            r12.height = r4
            r11.videoWidth = r15
            r11.videoHeight = r4
            java.lang.String r5 = "408"
            r11.backgroundImage = r5
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x0550:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x05cb
            java.lang.Object r14 = r3.next()
            n50.b r14 = (n50.C61619b) r14
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r15 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r15.<init>()
            r16 = r3
            boolean r3 = r0.f174707f
            if (r3 == 0) goto L_0x0578
            java.lang.String r3 = r14.f175221d
            r21 = r2
            java.lang.String r2 = r0.f174706e
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x057a
            java.lang.String r2 = r0.f174705d
            r15.roomId = r2
            goto L_0x057e
        L_0x0578:
            r21 = r2
        L_0x057a:
            java.lang.String r2 = r8.f175240f
            r14.f175226i = r2
        L_0x057e:
            java.lang.String r2 = r14.f175221d
            r15.userId = r2
            int r3 = r14.f175222e
            r15.streamType = r3
            r3 = 1
            int r5 = r5 + r3
            r15.zOrder = r5
            r15.pureAudio = r3
            r15.f165818x = r1
            r3 = 0
            r15.f165819y = r3
            r15.width = r1
            r15.height = r4
            n50.d$c r2 = r8.mo86565h(r2, r3)
            if (r2 == 0) goto L_0x059f
            boolean r3 = r2.f175256c
            r15.pureAudio = r3
        L_0x059f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r14 = r15.userId
            r3.append(r14)
            r3.append(r9)
            boolean r14 = r15.pureAudio
            r3.append(r14)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r2 = r11.mixUsers
            r2.add(r15)
            r3 = r16
            r2 = r21
            goto L_0x0550
        L_0x05cb:
            r21 = r2
            goto L_0x07f0
        L_0x05cf:
            r21 = r2
            r2 = 2
            if (r6 != r2) goto L_0x067a
            r2 = 0
            r12.f165818x = r2
            r12.f165819y = r2
            int r1 = r15 / 2
            r12.width = r1
            int r2 = r4 / 2
            r12.height = r2
            r11.videoWidth = r15
            r11.videoHeight = r2
            java.lang.String r2 = "409"
            r11.backgroundImage = r2
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x05ee:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x07f0
            java.lang.Object r5 = r2.next()
            n50.b r5 = (n50.C61619b) r5
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r14 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r14.<init>()
            boolean r15 = r0.f174707f
            if (r15 == 0) goto L_0x0614
            java.lang.String r15 = r5.f175221d
            r16 = r2
            java.lang.String r2 = r0.f174706e
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0616
            java.lang.String r2 = r0.f174705d
            r14.roomId = r2
            goto L_0x061a
        L_0x0614:
            r16 = r2
        L_0x0616:
            java.lang.String r2 = r8.f175240f
            r5.f175226i = r2
        L_0x061a:
            java.lang.String r2 = r5.f175221d
            r14.userId = r2
            int r5 = r5.f175222e
            r14.streamType = r5
            int r5 = r3 + 1
            r14.zOrder = r5
            r15 = 1
            r14.pureAudio = r15
            if (r3 != 0) goto L_0x0637
            r14.f165818x = r1
            r3 = 0
            r14.f165819y = r3
            r14.width = r1
            int r3 = r4 / 4
            r14.height = r3
            goto L_0x0643
        L_0x0637:
            if (r3 != r15) goto L_0x0643
            r14.f165818x = r1
            int r3 = r4 / 4
            r14.f165819y = r3
            r14.width = r1
            r14.height = r3
        L_0x0643:
            r3 = 0
            n50.d$c r2 = r8.mo86565h(r2, r3)
            if (r2 == 0) goto L_0x064e
            boolean r3 = r2.f175256c
            r14.pureAudio = r3
        L_0x064e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r15 = r14.userId
            r3.append(r15)
            r3.append(r9)
            boolean r15 = r14.pureAudio
            r3.append(r15)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r2 = r11.mixUsers
            r2.add(r14)
            r3 = r5
            r2 = r16
            goto L_0x05ee
        L_0x067a:
            r2 = 3
            if (r6 != r2) goto L_0x0734
            r2 = 0
            r12.f165818x = r2
            r12.f165819y = r2
            int r1 = r15 / 2
            r12.width = r1
            int r2 = r4 / 4
            r12.height = r2
            r11.videoWidth = r15
            r5 = 2
            int r4 = r4 / r5
            r11.videoHeight = r4
            java.lang.String r4 = "410"
            r11.backgroundImage = r4
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0699:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x07f0
            java.lang.Object r5 = r3.next()
            n50.b r5 = (n50.C61619b) r5
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r14 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r14.<init>()
            boolean r15 = r0.f174707f
            if (r15 == 0) goto L_0x06bf
            java.lang.String r15 = r5.f175221d
            r16 = r3
            java.lang.String r3 = r0.f174706e
            boolean r3 = r15.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x06c1
            java.lang.String r3 = r0.f174705d
            r14.roomId = r3
            goto L_0x06c5
        L_0x06bf:
            r16 = r3
        L_0x06c1:
            java.lang.String r3 = r8.f175240f
            r5.f175226i = r3
        L_0x06c5:
            java.lang.String r3 = r5.f175221d
            r14.userId = r3
            int r5 = r5.f175222e
            r14.streamType = r5
            int r5 = r4 + 1
            r14.zOrder = r5
            r15 = 1
            r14.pureAudio = r15
            if (r4 != 0) goto L_0x06e2
            r14.f165818x = r1
            r4 = 0
            r14.f165819y = r4
            r14.width = r1
            r14.height = r2
            r22 = r0
            goto L_0x06fb
        L_0x06e2:
            r22 = r0
            r0 = 0
            if (r4 != r15) goto L_0x06f0
            r14.f165818x = r0
            r14.f165819y = r2
            r14.width = r1
            r14.height = r2
            goto L_0x06fb
        L_0x06f0:
            r0 = 2
            if (r4 != r0) goto L_0x06fb
            r14.f165818x = r1
            r14.f165819y = r2
            r14.width = r1
            r14.height = r2
        L_0x06fb:
            r0 = 0
            n50.d$c r3 = r8.mo86565h(r3, r0)
            if (r3 == 0) goto L_0x0706
            boolean r0 = r3.f175256c
            r14.pureAudio = r0
        L_0x0706:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r4 = r14.userId
            r0.append(r4)
            r0.append(r9)
            boolean r4 = r14.pureAudio
            r0.append(r4)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r0 = r11.mixUsers
            r0.add(r14)
            r4 = r5
            r3 = r16
            r0 = r22
            goto L_0x0699
        L_0x0734:
            r0 = 4
            if (r6 < r0) goto L_0x07f0
            int r2 = r3.size()
            if (r2 < r0) goto L_0x074b
            int r0 = r3.size()
            if (r0 >= r5) goto L_0x074b
            float r0 = (float) r15
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 / r1
            int r1 = (int) r0
            int r0 = r1 / 2
            goto L_0x0758
        L_0x074b:
            int r0 = r3.size()
            if (r0 < r5) goto L_0x075f
            float r0 = (float) r15
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r1
            int r1 = (int) r0
            int r0 = r1 / 3
        L_0x0758:
            r2 = 0
            r23 = r1
            r1 = r0
            r0 = r23
            goto L_0x0761
        L_0x075f:
            r0 = r1
            r2 = 0
        L_0x0761:
            r12.f165818x = r2
            r12.f165819y = r2
            int r2 = r15 / 3
            r12.width = r2
            r12.height = r1
            r11.videoWidth = r15
            r11.videoHeight = r0
            int r0 = r3.size()
            r4 = 4
            if (r0 != r4) goto L_0x077b
            java.lang.String r0 = "81020"
            r11.backgroundImage = r0
            goto L_0x07aa
        L_0x077b:
            int r0 = r3.size()
            r7 = 5
            if (r0 != r7) goto L_0x0787
            java.lang.String r0 = "81021"
            r11.backgroundImage = r0
            goto L_0x07aa
        L_0x0787:
            int r0 = r3.size()
            if (r0 != r5) goto L_0x0792
            java.lang.String r0 = "81022"
            r11.backgroundImage = r0
            goto L_0x07aa
        L_0x0792:
            int r0 = r3.size()
            r5 = 7
            if (r0 != r5) goto L_0x079e
            java.lang.String r0 = "81023"
            r11.backgroundImage = r0
            goto L_0x07aa
        L_0x079e:
            int r0 = r3.size()
            r5 = 8
            if (r0 != r5) goto L_0x07aa
            java.lang.String r0 = "81024"
            r11.backgroundImage = r0
        L_0x07aa:
            r0 = 0
        L_0x07ab:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x07f1
            java.lang.Object r5 = r3.get(r0)
            n50.b r5 = (n50.C61619b) r5
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r7 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r7.<init>()
            java.lang.String r9 = r8.f175240f
            r5.f175226i = r9
            java.lang.String r9 = r5.f175221d
            r7.userId = r9
            int r5 = r5.f175222e
            r7.streamType = r5
            int r0 = r0 + 1
            r7.zOrder = r0
            r5 = 1
            r7.pureAudio = r5
            int r5 = r0 % 3
            int r5 = r5 * r2
            r7.f165818x = r5
            int r5 = r0 / 3
            int r5 = r5 * r2
            r7.f165819y = r5
            r7.width = r2
            r7.height = r1
            r5 = 0
            n50.d$c r9 = r8.mo86565h(r9, r5)
            if (r9 == 0) goto L_0x07ea
            boolean r5 = r9.f175256c
            r7.pureAudio = r5
        L_0x07ea:
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r5 = r11.mixUsers
            r5.add(r7)
            goto L_0x07ab
        L_0x07f0:
            r4 = 4
        L_0x07f1:
            n50.c r0 = n50.C61620c.C61622b.f175234a
            r1 = 1
            r0.f175230b = r1
            r0.f175231c = r6
            r0 = r21
            r8.f175247m = r0
            r0 = 0
            org.json.JSONObject r1 = r8.mo86567j(r11, r0)
            r8.mo86559b(r1, r11)
        L_0x0804:
            r4 = r1
            goto L_0x096e
        L_0x0807:
            r0 = 0
            n50.c r2 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r2 = r2.f175229a
            java.lang.String r3 = r8.f175247m
            n50.b r2 = r8.mo86562e(r2, r3)
            if (r2 != 0) goto L_0x0818
            java.lang.String r2 = r8.f175239e
            r8.f175247m = r2
        L_0x0818:
            n50.a r13 = r8.f175245k
            java.lang.String r14 = r8.f175240f
            r2 = 4
            r3 = 0
            r16 = r1
            r17 = r11
            r18 = r12
            org.json.JSONObject r1 = r13.mo86547e(r14, r15, r16, r17, r18)
            goto L_0x0804
        L_0x0829:
            r0 = 0
            r2 = 4
            r3 = 0
            n50.a r4 = r8.f175245k
            java.lang.String r5 = r8.f175240f
            r4.getClass()
            java.lang.String r6 = "selfRoomId"
            gy3.C87412m.m108594g(r5, r6)
            n50.c r6 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r6 = r6.f175229a
            java.lang.String r7 = "FinderLiveMicCloudMixture"
            if (r6 != 0) goto L_0x0849
            java.lang.String r1 = "micFocusGrabModeFillConfig remoteUserConfigList = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r4 = r3
            goto L_0x096e
        L_0x0849:
            int r9 = r6.size()
            r4.mo86543a()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "micGrabModeFillConfig videoHeight: "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r1 = " videoWidth: "
            r13.append(r1)
            r13.append(r15)
            java.lang.String r1 = " size: "
            r13.append(r1)
            r13.append(r9)
            java.lang.String r1 = " remoteUserConfigList: "
            r13.append(r1)
            r13.append(r6)
            java.lang.String r1 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r11.videoWidth = r15
            r11.videoHeight = r15
            java.lang.String r1 = "111318"
            r11.backgroundImage = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r14 = 0
        L_0x088a:
            r7 = 9
            if (r14 >= r7) goto L_0x08bd
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r7 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r7.<init>()
            int r13 = r14 + 1
            r7.zOrder = r13
            int r2 = r14 % 3
            float r2 = (float) r2
            r16 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r2 = r2 * r16
            float r3 = (float) r15
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.f165818x = r2
            int r14 = r14 / 3
            float r2 = (float) r14
            float r2 = r2 * r16
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.f165819y = r2
            float r3 = r3 * r16
            int r2 = (int) r3
            r7.width = r2
            r7.height = r2
            r1.add(r7)
            r14 = r13
            r2 = 4
            r3 = 0
            goto L_0x088a
        L_0x08bd:
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            int r2 = r2.f165818x
            r12.f165818x = r2
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            int r2 = r2.f165819y
            r12.f165819y = r2
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            int r2 = r2.width
            r12.width = r2
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            int r2 = r2.height
            r12.height = r2
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            java.lang.String r3 = r4.f175208e
            r2.userId = r3
            java.lang.Object r2 = r1.get(r0)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r2 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r2
            r3 = 1
            r2.zOrder = r3
            java.util.Iterator r2 = r6.iterator()
            r14 = 0
        L_0x08fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x093d
            java.lang.Object r3 = r2.next()
            int r6 = r14 + 1
            if (r14 < 0) goto L_0x0938
            n50.b r3 = (n50.C61619b) r3
            r3.f175226i = r5
            int r7 = r3.f175228n
            r13 = 1
            int r7 = r7 - r13
            java.lang.Object r7 = sx3.C110818d0.m150917O(r1, r7)
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r7 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r7
            if (r7 == 0) goto L_0x0936
            java.lang.String r14 = r3.f175221d
            r7.userId = r14
            int r3 = r3.f175222e
            r7.streamType = r3
            r7.pureAudio = r13
            n50.d r3 = r4.f175205b
            n50.d$c r3 = r3.mo86565h(r14, r0)
            if (r3 == 0) goto L_0x0931
            boolean r3 = r3.f175256c
            r7.pureAudio = r3
        L_0x0931:
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r3 = r11.mixUsers
            r3.add(r7)
        L_0x0936:
            r14 = r6
            goto L_0x08fd
        L_0x0938:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x093d:
            n50.c r2 = n50.C61620c.C61622b.f175234a
            r3 = 1
            r2.f175230b = r3
            r2.f175231c = r9
            org.json.JSONObject r1 = r4.mo86549g(r11, r1)
            goto L_0x0804
        L_0x094a:
            r0 = 0
            n50.c r2 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r2 = r2.f175229a
            java.lang.String r3 = r8.f175247m
            n50.b r2 = r8.mo86562e(r2, r3)
            if (r2 != 0) goto L_0x095b
            java.lang.String r2 = r8.f175239e
            r8.f175247m = r2
        L_0x095b:
            n50.a r13 = r8.f175245k
            java.lang.String r14 = r8.f175240f
            r16 = r1
            r17 = r11
            r18 = r12
            org.json.JSONObject r4 = r13.mo86548f(r14, r15, r16, r17, r18)
            goto L_0x096e
        L_0x096a:
            r12 = r6
            r10 = r7
            r0 = 0
            r4 = 0
        L_0x096e:
            r14 = 1
        L_0x096f:
            r8.f175251q = r4
            if (r19 == 0) goto L_0x0979
            if (r20 != 0) goto L_0x0979
            r12.width = r0
            r12.height = r0
        L_0x0979:
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r1.mo85947d()
            boolean r2 = r2.f174724t
            m50.e r1 = r1.mo85947d()
            boolean r1 = r1.f174725u
            if (r2 == 0) goto L_0x098d
            if (r1 == 0) goto L_0x098d
            r3 = 1
            goto L_0x098e
        L_0x098d:
            r3 = 0
        L_0x098e:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r5[r0] = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 1
            r5[r4] = r1
            java.lang.String r1 = "cloudmixing,is265:%b, forceMixing:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r5)
            if (r25 == 0) goto L_0x09b0
            com.tencent.trtc.TRTCCloud r1 = r8.f175236b
            r1.setMixTranscodingConfig(r11)
            java.lang.String r1 = "do cloudmixturing, reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x0a03
        L_0x09b0:
            if (r3 != 0) goto L_0x09ed
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r1 = r11.mixUsers
            if (r1 == 0) goto L_0x09bd
            int r1 = r1.size()
            r3 = 1
            if (r1 > r3) goto L_0x09ed
        L_0x09bd:
            int r1 = r8.f175248n
            r3 = 3
            if (r1 == r3) goto L_0x09ed
            r3 = 4
            if (r1 != r3) goto L_0x09c6
            goto L_0x09ed
        L_0x09c6:
            if (r19 == 0) goto L_0x09e1
            if (r20 != 0) goto L_0x09e1
            com.tencent.trtc.TRTCCloud r1 = r8.f175236b
            r1.setMixTranscodingConfig(r11)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "do cloudmixturing, config:%s, is265:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            goto L_0x0a03
        L_0x09e1:
            com.tencent.trtc.TRTCCloud r1 = r8.f175236b
            r2 = 0
            r1.setMixTranscodingConfig(r2)
            java.lang.String r1 = "cancel cloudmixturing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x0a03
        L_0x09ed:
            com.tencent.trtc.TRTCCloud r1 = r8.f175236b
            r1.setMixTranscodingConfig(r11)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "do cloudmixturing, config:%s, is265:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
        L_0x0a03:
            if (r14 == 0) goto L_0x0ab8
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r1 = r11.mixUsers
            if (r1 != 0) goto L_0x0a10
            java.lang.String r0 = "prepareLinkMicSeiInfo return nil, mixUserList == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0ab4
        L_0x0a10:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0a1e
            r2.remove(r0)
        L_0x0a1e:
            int r1 = r2.size()
            if (r1 != 0) goto L_0x0a2b
            java.lang.String r0 = "prepareLinkMicSeiInfo return nil, list.size == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0ab4
        L_0x0a2b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0a34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0a8b
            java.lang.Object r3 = r2.next()
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r3 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r3
            te3.lt2 r4 = new te3.lt2
            r4.<init>()
            n50.c r5 = n50.C61620c.C61622b.f175234a
            java.lang.String r6 = r3.userId
            n50.b r5 = r5.mo86554b(r6)
            java.lang.String r6 = r3.userId
            r4.f184154d = r6
            boolean r3 = r3.pureAudio
            r6 = 1
            r3 = r3 ^ r6
            r4.f184155e = r3
            if (r5 == 0) goto L_0x0a67
            int r3 = r5.f175225h
            int r5 = r8.f175244j
            if (r3 > r5) goto L_0x0a65
            int r3 = r4.f184156f
            r3 = r3 | r6
            r4.f184156f = r3
            goto L_0x0a67
        L_0x0a65:
            r4.f184156f = r0
        L_0x0a67:
            r1.add(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "prepareLinkMicSeiInfo mixUser.userid:"
            r3.append(r5)
            java.lang.String r5 = r4.f184154d
            r3.append(r5)
            java.lang.String r5 = " use_video:"
            r3.append(r5)
            boolean r4 = r4.f184155e
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            goto L_0x0a34
        L_0x0a8b:
            te3.kt2 r0 = new te3.kt2
            r0.<init>()
            java.util.LinkedList<te3.lt2> r2 = r0.f183982d
            r2.addAll(r1)
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x0ab4 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException | JSONException -> 0x0ab4 }
            r1.<init>(r0)     // Catch:{ IOException | JSONException -> 0x0ab4 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0ab4 }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x0ab4 }
            java.lang.String r0 = "wxT"
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException | JSONException -> 0x0ab5 }
            r4.putOpt(r0, r2)     // Catch:{ IOException | JSONException -> 0x0ab5 }
            java.lang.String r0 = "d"
            r4.putOpt(r0, r1)     // Catch:{ IOException | JSONException -> 0x0ab5 }
            goto L_0x0ab5
        L_0x0ab4:
            r4 = 0
        L_0x0ab5:
            r8.f175249o = r4
            goto L_0x0abb
        L_0x0ab8:
            r0 = 0
            r8.f175249o = r0
        L_0x0abb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendLinkMicSeiMsg linkMicSeiMsgJson:"
            r0.append(r1)
            org.json.JSONObject r1 = r8.f175249o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            org.json.JSONObject r0 = r8.f175249o
            if (r0 != 0) goto L_0x0adc
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r8.f175250p
            r0.stopTimer()
            goto L_0x0ae3
        L_0x0adc:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r8.f175250p
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.startTimer(r1)
        L_0x0ae3:
            n50.d$b r0 = r8.f175235a
            if (r0 == 0) goto L_0x0aee
            org.json.JSONArray r1 = r8.f175252r
            org.json.JSONObject r2 = r8.f175251q
            r0.mo75574G(r1, r2)
        L_0x0aee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.C61623d.mo86572o(boolean):void");
    }
}
