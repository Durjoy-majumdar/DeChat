package com.tencent.p014mm.accessibility.core;

import android.content.ContentResolver;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.tencent.p014mm.accessibility.core.AccConstants;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.RedScreenSoftwareUseStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gp3.C87315b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import su0.C36833e;
import sx3.C110818d0;
import sx3.C22415w0;
import sx3.C64175a0;
import sx3.C64187h0;
import sx3.C90363p0;
import z04.C112550d0;
import z04.C66731x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J\u0006\u0010\u0014\u001a\u00020\u0004R\u0014\u0010\u0016\u001a\u00020\u00158\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccReporter;", "", "", "time", "Lrx3/b0;", "saveReportTime", "getLastRepReportTime", "", "", "types", "addHasReportedType", "overwriteHasReportedType", "", "getHasReportedType", "reportInternal", "initListener", "releaseListener", "reportAppTypeIfNeed", "", "getAccServiceTypeArray", "reportTouchExplorationEnable", "", "TAG", "Ljava/lang/String;", "Lgp3/b;", "autoAuthCallback", "Lgp3/b;", "<init>", "()V", "feature-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.AccReporter */
public final class AccReporter {
    public static final AccReporter INSTANCE = new AccReporter();
    public static final String TAG = "MicroMsg.Acc.AccReporter";
    private static C87315b<?> autoAuthCallback;

    private AccReporter() {
    }

    private final void addHasReportedType(int... iArr) {
        Set<T> C0 = C110818d0.m150902C0(getHasReportedType());
        C87412m.m108594g(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        C64175a0.m75509q(C0, numArr);
        MultiProcessMMKV.getDefault().putString(AccConstants.ReportMMKVKey.HasReportDataString, C110818d0.m150921S(C0, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }

    private final List<Integer> getHasReportedType() {
        String string = MultiProcessMMKV.getDefault().getString(AccConstants.ReportMMKVKey.HasReportDataString, "");
        List<String> U = C112550d0.m153785U(string == null ? "" : string, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String e : U) {
            Integer e2 = C66731x.m78731e(e);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private final long getLastRepReportTime() {
        return MultiProcessMMKV.getDefault().getLong(AccConstants.ReportMMKVKey.LastReportTimeLong, 0);
    }

    private final void overwriteHasReportedType(int... iArr) {
        Collection collection;
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        C87412m.m108594g(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                collection = new LinkedHashSet(C90363p0.m113142a(iArr.length));
                for (int valueOf : iArr) {
                    collection.add(Integer.valueOf(valueOf));
                }
            } else {
                collection = C22415w0.m26092a(Integer.valueOf(iArr[0]));
            }
        } else {
            collection = C64187h0.f181908d;
        }
        multiProcessMMKV.putString(AccConstants.ReportMMKVKey.HasReportDataString, C110818d0.m150921S(collection, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }

    private final void reportInternal(List<Integer> list) {
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            Log.m105924i(TAG, "reportInternal: " + intValue2);
            RedScreenSoftwareUseStruct redScreenSoftwareUseStruct = new RedScreenSoftwareUseStruct();
            redScreenSoftwareUseStruct.f10033d = (long) intValue2;
            redScreenSoftwareUseStruct.mo86054n();
        }
    }

    private final void saveReportTime(long j) {
        MultiProcessMMKV.getDefault().putLong(AccConstants.ReportMMKVKey.LastReportTimeLong, j);
    }

    public final List<Integer> getAccServiceTypeArray() {
        ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("enabled_accessibility_services");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/accessibility/core/AccReporter", "getAccServiceTypeArray", "()Ljava/util/List;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(XVFSFile.PATH_SEPARATOR_CHAR);
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext()) {
                String next = simpleStringSplitter.next();
                C87412m.m108593f(next, "splitter.next()");
                Log.m105924i(TAG, "getAccServiceTypeArray: " + next);
                if (C112550d0.m153801u(next, AccConstants.ServiceName.TalkBack, false) && C112550d0.m153801u(next, AccConstants.ServicePackage.TalkBack, false)) {
                    arrayList.add(1);
                } else if (C112550d0.m153801u(next, AccConstants.ServiceName.ScreenReader, false) && C112550d0.m153801u(next, AccConstants.ServicePackage.ScreenReader, false)) {
                    arrayList.add(2);
                } else if (C112550d0.m153801u(next, AccConstants.ServiceName.JieShuo, false) && C112550d0.m153801u(next, AccConstants.ServicePackage.JieShuo, false)) {
                    arrayList.add(4);
                } else if (C112550d0.m153801u(next, AccConstants.ServiceName.DianMing, false) && C112550d0.m153801u(next, AccConstants.ServicePackage.DianMing, false)) {
                    arrayList.add(3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        return arrayList;
    }

    public final void initListener() {
        autoAuthCallback = ((C36833e) C86312j.m106911c(C36833e.class)).mo60841CI(new AccReporter$initListener$1());
    }

    public final void releaseListener() {
        C87315b<?> bVar = autoAuthCallback;
        if (bVar != null) {
            bVar.dead();
        }
    }

    public final void reportAppTypeIfNeed() {
        if (C86709a0.m107522a() && AccUtil.INSTANCE.isAccessibilityEnabled()) {
            boolean z = !DateUtils.isToday(getLastRepReportTime());
            List<Integer> accServiceTypeArray = getAccServiceTypeArray();
            if (!accServiceTypeArray.isEmpty()) {
                if (z) {
                    reportInternal(accServiceTypeArray);
                    int[] x0 = C110818d0.m150952x0(accServiceTypeArray);
                    overwriteHasReportedType(Arrays.copyOf(x0, x0.length));
                } else {
                    accServiceTypeArray.removeAll(INSTANCE.getHasReportedType());
                    reportInternal(accServiceTypeArray);
                    int[] x05 = C110818d0.m150952x0(accServiceTypeArray);
                    addHasReportedType(Arrays.copyOf(x05, x05.length));
                }
                saveReportTime(System.currentTimeMillis());
            }
        }
    }

    public final void reportTouchExplorationEnable() {
        C117407d.INSTANCE.idkeyStat(AccConstants.ReportKey.f8994ID, 0, 1, false);
    }
}
