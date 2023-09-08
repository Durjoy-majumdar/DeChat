package hf0;

import cf0.C80030i;
import com.tencent.stubs.logger.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hf0.d */
public class C87489d {

    /* renamed from: a */
    public List<C80030i<Void>> f253478a;

    /* renamed from: b */
    public List<C80030i<Void>> f253479b;

    /* renamed from: c */
    public final long f253480c;

    /* renamed from: d */
    public List<C87485a> f253481d;

    /* renamed from: e */
    public final String f253482e;

    /* renamed from: f */
    public final long f253483f;

    /* renamed from: g */
    public final long f253484g;

    /* renamed from: h */
    public List<Long> f253485h = new ArrayList();

    /* renamed from: i */
    public List<String> f253486i;

    public C87489d(List<C80030i<Void>> list, List<C80030i<Void>> list2, long j, List<C87485a> list3, String str, long j2, long j3, long j4, List<Long> list4, List<String> list5) {
        new ArrayList();
        this.f253478a = list;
        this.f253480c = j;
        this.f253479b = list2;
        this.f253481d = list3;
        this.f253482e = str;
        this.f253483f = j2;
        this.f253484g = j3;
        this.f253485h = list4;
        this.f253486i = list5;
    }

    /* renamed from: a */
    public void mo121952a() {
        try {
            List<C80030i<Void>> list = this.f253478a;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e) {
            Log.m106505i("PatchApplyPlan", "oldFileUncompressionPlan, e = " + e);
        }
        try {
            List<C80030i<Void>> list2 = this.f253479b;
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception e2) {
            Log.m106505i("PatchApplyPlan", "deltaFriendlyNewFileRecompressionPlan, e = " + e2);
        }
        try {
            List<C87485a> list3 = this.f253481d;
            if (list3 != null) {
                list3.clear();
            }
        } catch (Exception e3) {
            Log.m106505i("PatchApplyPlan", "deltaDescriptors, e = " + e3);
        }
        try {
            List<Long> list4 = this.f253485h;
            if (list4 != null) {
                list4.clear();
            }
        } catch (Exception e4) {
            Log.m106505i("PatchApplyPlan", "newSameToUnCompass, e = " + e4);
        }
    }
}
