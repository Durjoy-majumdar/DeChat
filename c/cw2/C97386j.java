package cw2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kw2.C34077l;
import kw2.C34078m;
import kw2.C99263b;
import kw2.C99264e;
import kw2.C99265f;
import kw2.C99268i;
import kw2.C99269j;
import kw2.C99270n;
import nj3.C76912y0;
import p232rw.C77573p;
import p740wo.C53193b;
import sx3.C110823p;
import sx3.C64197v;
import te3.pc4;
import yc3.C38992a;

/* renamed from: cw2.j */
public final class C97386j implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor putInt2;
        SharedPreferences.Editor putInt3;
        SharedPreferences.Editor putInt4;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putInt5;
        SharedPreferences.Editor putInt6;
        SharedPreferences.Editor putInt7;
        SharedPreferences.Editor putInt8;
        Context context2 = context;
        String[] strArr2 = strArr;
        C87412m.m108594g(strArr2, "args");
        C87412m.m108594g(str, "username");
        Log.m105924i("MicroMsg.StoryCommand", C110823p.m150987M(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
        if (strArr2.length <= 1) {
            return false;
        }
        String str2 = strArr2[1];
        String str3 = "";
        SharedPreferences sharedPreferences = null;
        switch (str2.hashCode()) {
            case -2127268982:
                if (str2.equals("strangerDump")) {
                    Iterator it = ((ArrayList) StoryCore.f281736t.mo134189g().mo138639Lo()).iterator();
                    while (it.hasNext()) {
                        C99264e eVar = (C99264e) it.next();
                        Log.m105924i("MicroMsg.StoryCommand", "strangerDump " + eVar.getUserName() + ' ' + eVar.field_syncId + ' ' + eVar.field_readId + ' ' + eVar.field_storyPostTime + ' ' + eVar.field_updateTime);
                    }
                    return true;
                }
                break;
            case -2126867668:
                if (str2.equals("strangerRead")) {
                    Iterator it4 = ((ArrayList) StoryCore.f281736t.mo134189g().mo138639Lo()).iterator();
                    while (it4.hasNext()) {
                        C99264e eVar2 = (C99264e) it4.next();
                        eVar2.field_readId = eVar2.field_syncId;
                        StoryCore.f281736t.mo134189g().mo138641SE(eVar2);
                    }
                    return true;
                }
                break;
            case -2122675824:
                if (str2.equals("dumpFile")) {
                    C97391o.f285892a.mo136651d();
                    return true;
                }
                break;
            case -2113815067:
                if (str2.equals("testcopyDb")) {
                    String str4 = StoryCore.f281736t.mo134184b() + "StoryMicroMsg.db";
                    C86013q1.m106442c(C86709a0.m107535s().f251807e + "StoryMicroMsg.db", str4);
                    Log.m105924i("MicroMsg.StoryCommand", "copydb " + str4);
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "copydb done", 1).show();
                    return true;
                }
                break;
            case -1699823967:
                if (str2.equals("resetFirst")) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_BUBBLE_COUNT_INT, 0);
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC;
                    Boolean bool = Boolean.FALSE;
                    i.mo119677K(aVar, bool);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_CAPTURE_FIRST_BOOLEAN_SYNC, bool);
                    return true;
                }
                break;
            case -1522028681:
                if (str2.equals("strangerClear")) {
                    Iterator it5 = ((ArrayList) StoryCore.f281736t.mo134189g().mo138648qq()).iterator();
                    while (it5.hasNext()) {
                        StoryCore.f281736t.mo134189g().delete((C99264e) it5.next(), new String[0]);
                    }
                    return true;
                }
                break;
            case -1408241804:
                if (str2.equals("testDumpInfo")) {
                    StoryCore.C96337h hVar = StoryCore.f281736t;
                    Cursor rawQuery = hVar.mo134193k().f291097d.rawQuery("select count(*) from StoryVideoCacheInfo", (String[]) null);
                    int count = rawQuery.getCount();
                    rawQuery.close();
                    Cursor rawQuery2 = hVar.mo134191i().f291093h.rawQuery("select count(*) from MMStoryInfo", (String[]) null);
                    int count2 = rawQuery2.getCount();
                    rawQuery2.close();
                    Log.m105924i("MicroMsg.StoryCommand", "info1 " + ("StoryVideoCacheInfo resultData " + count) + " info2 " + ("MMStoryInfo" + " resultData " + count2));
                    return true;
                }
                break;
            case -534114059:
                if (str2.equals("allmockData")) {
                    String str5 = strArr2[2];
                    StoryCore.C96337h hVar2 = StoryCore.f281736t;
                    C99264e jo = hVar2.mo134189g().mo138646jo("foreverzeus");
                    C99269j i2 = hVar2.mo134191i();
                    boolean isEqual = Util.isEqual(hVar2.mo134187e(), "foreverzeus");
                    int e = C31543z5.m39455e();
                    C97387k.f285887a.mo136646a();
                    C99269j.C10425a aVar2 = C99269j.f291079j;
                    List<C99268i> bD = i2.mo138668bD("foreverzeus", isEqual, e - 86400, false);
                    if (bD.isEmpty()) {
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "allmockData error1", 1).show();
                        return true;
                    }
                    List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str5);
                    if (k5 != null) {
                        for (String str6 : k5) {
                            StoryCore.C96337h hVar3 = StoryCore.f281736t;
                            C99265f g = hVar3.mo134189g();
                            C87412m.m108593f(str6, LocaleUtil.ITALIAN);
                            C99264e jo4 = g.mo138646jo(str6);
                            int i3 = (int) jo4.systemRowid;
                            if (!jo4.isValid()) {
                                jo.field_userName = str6;
                                jo.field_storyPostTime = (int) Util.currentTicks();
                                jo.systemRowid = -1;
                                if (i3 < 0) {
                                    hVar3.mo134189g().insert(jo);
                                } else {
                                    hVar3.mo134189g().mo138642TE(((long) i3) * 1, jo);
                                }
                            }
                            C99268i iVar = bD.get(0);
                            iVar.field_userName = str6;
                            iVar.field_createTime = C31543z5.m39455e();
                            pc4 p2 = iVar.mo138657p2();
                            p2.f299133e = str6;
                            iVar.mo138662u2(p2);
                            hVar3.mo134191i().insert(iVar);
                        }
                    }
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "allmockData done", 1).show();
                    return true;
                }
                break;
            case -505421199:
                if (str2.equals("copyfile")) {
                    String str7 = strArr2[2];
                    C97391o oVar = C97391o.f285892a;
                    oVar.mo136651d();
                    C87412m.m108594g(str7, "path");
                    oVar.mo136650c(oVar.mo136648a() + "cpfiles/", true);
                    Uri n = C116299g2.m163858n(str7);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(oVar.mo136648a());
                        sb.append("cpfiles/");
                        String path2 = n.getPath();
                        int lastIndexOf = path2.lastIndexOf("/");
                        if (lastIndexOf >= 0) {
                            path2 = path2.substring(lastIndexOf + 1);
                        }
                        sb.append(path2);
                        str3 = sb.toString();
                        Log.m105924i("MicroMsg.StoryFileNameUtil", "copy file path " + str7 + " newPath " + str3);
                        C86013q1.m106442c(str7, str3);
                    }
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "copyFile done " + str3, 1).show();
                    return true;
                }
                break;
            case -350339842:
                if (str2.equals("reseti2v")) {
                    if (context2 != null) {
                        sharedPreferences = context2.getSharedPreferences("storyi2v", 0);
                    }
                    if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putInt = edit.putInt("storyi2v_bitRate", 3500000)) == null || (putInt2 = putInt.putInt("storyi2v_frameRate", 15)) == null || (putInt3 = putInt2.putInt("storyi2v_iFrameInterval", 10)) == null || (putInt4 = putInt3.putInt("storyi2v_MaxSize", TAVExporter.VIDEO_EXPORT_WIDTH)) == null) {
                        return true;
                    }
                    putInt4.commit();
                    return true;
                }
                break;
            case 102573:
                if (str2.equals("i2v")) {
                    int safeParseInt = Util.safeParseInt(strArr2[2]);
                    int safeParseInt2 = Util.safeParseInt(strArr2[3]);
                    int safeParseInt3 = Util.safeParseInt(strArr2[4]);
                    int safeParseInt4 = Util.safeParseInt(strArr2[5]);
                    if (context2 != null) {
                        sharedPreferences = context2.getSharedPreferences("storyi2v", 0);
                    }
                    if (sharedPreferences == null || (edit2 = sharedPreferences.edit()) == null || (putInt5 = edit2.putInt("storyi2v_bitRate", safeParseInt)) == null || (putInt6 = putInt5.putInt("storyi2v_frameRate", safeParseInt2)) == null || (putInt7 = putInt6.putInt("storyi2v_iFrameInterval", safeParseInt3)) == null || (putInt8 = putInt7.putInt("storyi2v_MaxSize", safeParseInt4)) == null) {
                        return true;
                    }
                    putInt8.commit();
                    return true;
                }
                break;
            case 149228377:
                if (str2.equals("allmakeData")) {
                    int safeParseInt5 = Util.safeParseInt(strArr2[2]);
                    Log.m105924i("MicroMsg.StoryCommand", "testMakeData datacount " + safeParseInt5);
                    StoryCore.C96337h hVar4 = StoryCore.f281736t;
                    C99269j i4 = hVar4.mo134191i();
                    boolean isEqual2 = Util.isEqual(hVar4.mo134187e(), "ychengo");
                    int e2 = C31543z5.m39455e();
                    C97387k.f285887a.mo136646a();
                    C99269j.C10425a aVar3 = C99269j.f291079j;
                    int i5 = 0;
                    List<C99268i> bD2 = i4.mo138668bD("ychengo", isEqual2, e2 - 86400, false);
                    int i6 = 0;
                    while (i6 < safeParseInt5) {
                        C99268i iVar2 = bD2.get(i5);
                        iVar2.field_userName = "ychengo";
                        iVar2.field_createTime = C31543z5.m39455e();
                        pc4 p25 = iVar2.mo138657p2();
                        p25.f299133e = "ychengo";
                        iVar2.mo138662u2(p25);
                        StoryCore.f281736t.mo134191i().insert(iVar2);
                        i6++;
                        i5 = 0;
                    }
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "testMakeData done " + safeParseInt5, 1).show();
                    return true;
                }
                break;
            case 536375440:
                if (str2.equals("allunread")) {
                    StoryCore.C96337h hVar5 = StoryCore.f281736t;
                    hVar5.mo134191i().mo138663Lo();
                    hVar5.mo134193k().mo138676jo();
                    C86013q1.m106445f(hVar5.mo134183a());
                    Iterator it6 = ((ArrayList) hVar5.mo134189g().mo138648qq()).iterator();
                    while (it6.hasNext()) {
                        C99264e eVar3 = (C99264e) it6.next();
                        eVar3.field_readId = 0;
                        eVar3.field_md5 = str3;
                        eVar3.field_preLoadResource = 0;
                        eVar3.field_preloadMediaId = str3;
                        eVar3.field_preloadStoryId = 0;
                        StoryCore.f281736t.mo134189g().mo138642TE(eVar3.systemRowid, eVar3);
                    }
                    Log.m105924i("MicroMsg.StoryCommand", "allUnRead done");
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "allUnRead Done", 1).show();
                    return true;
                }
                break;
            case 769522478:
                if (str2.equals("commentClear")) {
                    Iterator it7 = ((ArrayList) StoryCore.f281736t.mo134188f().mo138635jo()).iterator();
                    while (it7.hasNext()) {
                        StoryCore.f281736t.mo134188f().delete((C99263b) it7.next(), new String[0]);
                    }
                    return true;
                }
                break;
            case 856773767:
                if (str2.equals("cleandb")) {
                    Log.m105924i("MicroMsg.StoryCommand", "cleanDb");
                    StoryCore.C96337h hVar6 = StoryCore.f281736t;
                    hVar6.mo134193k().mo138676jo();
                    Log.m105924i("MicroMsg.StoryExtInfoStorage", "dropTable " + hVar6.mo134189g().f291067h.delete("StoryExtItem", (String) null, (String[]) null));
                    C86709a0.m107523b().mo121108c();
                    if (hVar6.mo134185c().f281744h == null) {
                        hVar6.mo134185c().f281744h = new C34077l(hVar6.mo134186d());
                    }
                    C34077l lVar = hVar6.mo134185c().f281744h;
                    C87412m.m108591d(lVar);
                    Log.m105924i("MicroMsg.StoryRoomInfoStorage", "dropTable " + lVar.f91951d.delete("StoryRoomInfo", (String) null, (String[]) null));
                    hVar6.mo134191i().mo138663Lo();
                    C86013q1.m106445f(hVar6.mo134183a());
                    ((C77573p) C86312j.m106911c(C77573p.class)).mo60535jv();
                    return true;
                }
                break;
            case 1233668806:
                if (str2.equals("videoCacheClear")) {
                    C99270n k2 = StoryCore.f281736t.mo134193k();
                    ArrayList arrayList = new ArrayList();
                    Cursor rawQuery3 = k2.f291097d.rawQuery("select * from StoryVideoCacheInfo", (String[]) null);
                    if (rawQuery3 != null) {
                        while (rawQuery3.moveToNext()) {
                            C34078m mVar = new C34078m();
                            mVar.convertFrom(rawQuery3);
                            arrayList.add(mVar);
                        }
                        rawQuery3.close();
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        StoryCore.f281736t.mo134193k().delete((C34078m) it8.next(), new String[0]);
                    }
                    return true;
                }
                break;
            case 1368796312:
                if (str2.equals("createFile")) {
                    C97391o oVar2 = C97391o.f285892a;
                    oVar2.getClass();
                    String a = StoryCore.f281736t.mo134183a();
                    Log.m105924i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache " + a);
                    Iterable<C86001b0> t = C86013q1.m106459t(a, true);
                    for (int i7 = 0; i7 < 100; i7++) {
                        if (t != null) {
                            int i8 = 0;
                            for (C86001b0 next : t) {
                                int i9 = i8 + 1;
                                if (i8 >= 0) {
                                    C86001b0 b0Var = next;
                                    String str8 = b0Var.f250472b;
                                    C87412m.m108593f(str8, "it.name");
                                    if (!oVar2.mo136653f(str8)) {
                                        C86013q1.m106442c(b0Var.f250471a, b0Var.f250471a + System.currentTimeMillis());
                                        if (i8 <= 2) {
                                        }
                                    }
                                    i8 = i9;
                                } else {
                                    C64197v.m75542k();
                                    throw null;
                                }
                            }
                            continue;
                        }
                    }
                    Log.m105924i("MicroMsg.StoryFileNameUtil", "testCreateFiles done cache " + a);
                    return true;
                }
                break;
            case 1550482439:
                if (str2.equals("delfile")) {
                    C97391o.f285892a.getClass();
                    C86013q1.m106445f(StoryCore.f281736t.mo134183a());
                    return true;
                }
                break;
            case 2103071987:
                if (str2.equals("commentDump")) {
                    Iterator it9 = ((ArrayList) StoryCore.f281736t.mo134188f().mo138635jo()).iterator();
                    while (it9.hasNext()) {
                        C99263b bVar = (C99263b) it9.next();
                        Log.m105924i("MicroMsg.StoryCommand", "commentDump " + bVar.field_storyId + ' ' + bVar.field_readCommentId + ' ' + bVar.field_syncCommentId);
                    }
                    return true;
                }
                break;
        }
        return false;
    }
}
