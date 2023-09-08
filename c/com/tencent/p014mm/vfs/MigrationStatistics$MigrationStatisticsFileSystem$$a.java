package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qp3.C118196a;
import qp3.C118201e;

/* renamed from: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$a */
public final /* synthetic */ class MigrationStatistics$MigrationStatisticsFileSystem$$a implements C118196a.C89789a {

    /* renamed from: a */
    public final /* synthetic */ Pattern f250453a;

    /* renamed from: b */
    public final /* synthetic */ List f250454b;

    /* renamed from: c */
    public final /* synthetic */ Set f250455c;

    /* renamed from: d */
    public final /* synthetic */ List f250456d;

    /* renamed from: e */
    public final /* synthetic */ int f250457e;

    /* renamed from: f */
    public final /* synthetic */ List f250458f;

    /* renamed from: g */
    public final /* synthetic */ TreeMap f250459g;

    /* renamed from: h */
    public final /* synthetic */ FileSystem.C85995c f250460h;

    public /* synthetic */ MigrationStatistics$MigrationStatisticsFileSystem$$a(Pattern pattern, List list, Set set, List list2, int i, List list3, TreeMap treeMap, FileSystem.C85995c cVar) {
        this.f250453a = pattern;
        this.f250454b = list;
        this.f250455c = set;
        this.f250456d = list2;
        this.f250457e = i;
        this.f250458f = list3;
        this.f250459g = treeMap;
        this.f250460h = cVar;
    }

    /* renamed from: a */
    public final Iterable mo119949a(Object obj) {
        Pattern pattern = this.f250453a;
        List list = this.f250454b;
        Set set = this.f250455c;
        List list2 = this.f250456d;
        int i = this.f250457e;
        List list3 = this.f250458f;
        TreeMap treeMap = this.f250459g;
        FileSystem.C85995c cVar = this.f250460h;
        C86001b0 b0Var = (C86001b0) obj;
        if (!b0Var.f250476f) {
            return Collections.singleton(b0Var);
        }
        String str = b0Var.f250472b;
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group != null && !group.isEmpty()) {
                list.add(str);
                return null;
            } else if (set.contains(str)) {
                list2.add(str);
                return null;
            } else if (i == 0) {
                list3.add(str);
                return null;
            } else {
                treeMap.put(Long.valueOf(b0Var.f250475e), str);
                return null;
            }
        } else if (Arrays.binarySearch(MigrationStatistics.f348782b, b0Var.f250472b) < 0) {
            return null;
        } else {
            return new C118201e(Collections.singleton(b0Var), C116299g2.m163860p(cVar, b0Var.f250471a, false, (C116299g2.C86006b<C86001b0>) null));
        }
    }
}
