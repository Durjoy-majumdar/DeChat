package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Pattern;
import kj2.C117407d;
import org.xwalk.core.XWalkEnvironment;
import qp3.C118197b;

/* renamed from: com.tencent.mm.vfs.MigrationStatistics */
public class MigrationStatistics {

    /* renamed from: a */
    public static final String[] f348781a = {"Download", "attachment", "image", "image2", "record", "video", "voice2"};

    /* renamed from: b */
    public static final String[] f348782b = {".planCache", "CheckResUpdate_1", "CronetCache", "configlist", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "mmslot", "tmpScanLicense", "webservice", "CDNTemp", "test_writable", "xlogtest_writable", ".planCache", ".tmp", "AudioRecord", "CDNTemp", "CheckResUpdate", "CheckResUpdate_1", "ClickFlow", "CronetCache", "Diagnostic", "Download", "FailMsgFileCache", "Game", "Handler", "ProcessDetector", "SQLTrace", "ThumbVideoCache", "WebCanvasPkg", "WebviewCache", XWalkEnvironment.MODULE_APPBRAND, "avatar", "browser", "card", "configlist", AppMeasurement.CRASH_ORIGIN, "diskcache", "download", "egg_spring", "exdevice", "facedir", "fts", "game", "hbstoryvideo", "hilive", "imagecache", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "last_avatar_dir", "mail", "mapsdk", "mmslot", "music", "recovery", "regioncode", "taxi_icon", "temp_video_cache", "test_writable", "tmpScanLicense", "trace", "video", "vusericon", "wagamefiles", "wallet", "wallet", "wallet_images", "webcompt", "webservice", "webview_tmpl", "wenote", "wepkg", "wvtemp", "wxacache", "wxafiles", "wxanewfiles", "wxauto", "wxvideocache", "wxvideotmp", "xlog", "xlogtest_writable"};

    /* renamed from: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem */
    public static final class MigrationStatisticsFileSystem extends C86010o0 implements FileSystem {
        public static final Parcelable.Creator<MigrationStatisticsFileSystem> CREATOR = new MigrationStatistics$MigrationStatisticsFileSystem$$d();

        public MigrationStatisticsFileSystem(C85996a aVar) {
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            List list;
            List list2;
            List<Pair<String, String>> c = VFSStrategy.m163775c();
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) c).iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                hashSet.add((String) pair.first);
                hashSet.add((String) pair.second);
                if (Objects.equals(pair.first, pair.second) && !"ee1da3ae2100e09165c2e52382cfe79f".equals(pair.first)) {
                    i2++;
                }
            }
            cancellationSignal.throwIfCanceled();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            TreeMap treeMap = new TreeMap();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            NativeFileSystem nativeFileSystem = new NativeFileSystem("${storage}/tencent/MicroMsg");
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            FileSystem.C85995c d = nativeFileSystem.mo177578v(f0Var.mo177791d());
            Iterable list3 = d.list("");
            if (list3 == null) {
                list3 = Collections.emptyList();
            }
            Iterable iterable = list3;
            MigrationStatistics$MigrationStatisticsFileSystem$$a migrationStatistics$MigrationStatisticsFileSystem$$a = r1;
            MigrationStatistics$MigrationStatisticsFileSystem$$a migrationStatistics$MigrationStatisticsFileSystem$$a2 = new MigrationStatistics$MigrationStatisticsFileSystem$$a(Pattern.compile("[0-9a-f]{32}(temp[0-9]+)?"), arrayList3, hashSet, arrayList2, i2, arrayList4, treeMap, d);
            String d2 = C116299g2.m163848d(f0Var.mo177791d(), "account");
            String d3 = C116299g2.m163848d(f0Var.mo177791d(), "accountSalt");
            if (!(d2 == null || d3 == null)) {
                arrayList2.remove(d2);
                arrayList2.remove(d3);
                arrayList.add(d2);
                arrayList.add(d3);
            }
            ArrayList arrayList5 = new ArrayList(treeMap.values());
            if (i2 <= treeMap.size()) {
                list2 = null;
                list = null;
            } else {
                list = arrayList5.subList(0, i2);
                list2 = arrayList5.subList(i2, arrayList5.size());
            }
            C118197b bVar = new C118197b(iterable.iterator(), migrationStatistics$MigrationStatisticsFileSystem$$a);
            while (bVar.hasNext()) {
                C86001b0 b0Var = (C86001b0) bVar.next();
                i++;
                if ((i & 15) == 0) {
                    cancellationSignal.throwIfCanceled();
                }
                long j = b0Var.f250474d;
            }
            String[] strArr = MigrationStatistics.f348781a;
            FileSystem.C85995c cVar = d;
            mo177687z(arrayList, "@@Remained_MyAccount_C2C", d, strArr, 262144, cancellationSignal);
            mo177687z(arrayList2, "@@Remained_KnownAccount_C2C", cVar, strArr, 262144, cancellationSignal);
            if (list == null) {
                mo177687z(arrayList5, "@@Remained_UnknownAccount0_C2C", cVar, strArr, 262144, cancellationSignal);
            } else {
                FileSystem.C85995c cVar2 = cVar;
                String[] strArr2 = strArr;
                CancellationSignal cancellationSignal2 = cancellationSignal;
                mo177687z(list, "@@Remained_UnknownAccount1_C2C", cVar2, strArr2, 262144, cancellationSignal2);
                mo177687z(list2, "@@Remained_UnknownAccount2_C2C", cVar2, strArr2, 262144, cancellationSignal2);
            }
            mo177687z(arrayList3, "@@Remained_DroppedAccount_C2C", cVar, strArr, 262144, cancellationSignal);
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return this;
        }

        /* renamed from: v */
        public Object mo177578v(Map map) {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        /* renamed from: z */
        public final void mo177687z(List<String> list, String str, FileSystem.C85995c cVar, String[] strArr, long j, CancellationSignal cancellationSignal) {
            if (!list.isEmpty()) {
                MigrationStatistics$MigrationStatisticsFileSystem$$b migrationStatistics$MigrationStatisticsFileSystem$$b = new MigrationStatistics$MigrationStatisticsFileSystem$$b(cVar, strArr);
                long currentTimeMillis = System.currentTimeMillis();
                C118197b bVar = new C118197b(list.iterator(), migrationStatistics$MigrationStatisticsFileSystem$$b);
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (bVar.hasNext()) {
                    C86001b0 b0Var = (C86001b0) bVar.next();
                    i3++;
                    if ((i3 & 15) == 0) {
                        cancellationSignal.throwIfCanceled();
                    }
                    j3 += b0Var.f250474d;
                    if (b0Var.f250476f) {
                        i2++;
                    } else {
                        i++;
                        j4 += Math.max(0, currentTimeMillis - b0Var.f250475e);
                    }
                }
                C117407d dVar = C117407d.INSTANCE;
                Object[] objArr = new Object[14];
                objArr[0] = str;
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = "";
                objArr[4] = Long.valueOf(j3);
                objArr[5] = Integer.valueOf(i);
                objArr[6] = Integer.valueOf(i2);
                objArr[7] = 0;
                objArr[8] = 0;
                objArr[9] = 0;
                if (i > 0) {
                    j2 = j4 / ((long) i);
                }
                objArr[10] = Long.valueOf(j2);
                objArr[11] = 0;
                objArr[12] = 0;
                objArr[13] = BuildInfo.REV;
                dVar.mo160131h(21388, objArr);
            }
        }
    }
}
