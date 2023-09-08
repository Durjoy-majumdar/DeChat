package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.DeleteAllFileSystem;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.MigrationFileSystem;
import com.tencent.p014mm.vfs.NativeFileSystem;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import z04.C66716g;
import z04.C66717h;
import z04.C66723k;

/* renamed from: com.tencent.mm.vfs.b2 */
public final class C116267b2 {

    /* renamed from: a */
    public static final C66723k f348899a = new C66723k("(?:com\\.tencent\\.mm|tencent)\\/(?:MicroMsg|cache)\\/([0-9a-fA-F]{32})");

    /* renamed from: b */
    public static final List<C13604l<Class<?>, C32227p<C116270c, FileSystem.C85995c, Boolean>>> f348900b = C64197v.m75537f(new C13604l(MigrationFileSystem.C116222b.class, C116268a.f348901d), new C13604l(DeleteAllFileSystem.C116207b.class, C116269b.f348902d));

    /* renamed from: com.tencent.mm.vfs.b2$a */
    public static final class C116268a extends C87413o implements C32227p<C116270c, FileSystem.C85995c, Boolean> {

        /* renamed from: d */
        public static final C116268a f348901d = new C116268a();

        public C116268a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            T t;
            boolean z;
            C116270c cVar = (C116270c) obj;
            FileSystem.C85995c cVar2 = (FileSystem.C85995c) obj2;
            C87412m.m108594g(cVar, "ctx");
            C87412m.m108594g(cVar2, "fs");
            if (!(cVar2 instanceof MigrationFileSystem.C116222b)) {
                return Boolean.FALSE;
            }
            C13604l lVar = null;
            for (FileSystem.C85995c next : C116299g2.m163846b(cVar2, (C116299g2.C86006b<FileSystem.C85995c>) null)) {
                if (next instanceof NativeFileSystem.C116228g) {
                    C66723k kVar = C116267b2.f348899a;
                    NativeFileSystem.C116228g gVar = (NativeFileSystem.C116228g) next;
                    String str = gVar.f348790e;
                    C87412m.m108593f(str, "cfs.mRealBasePath");
                    C66716g a = kVar.mo90757a(str, 0);
                    if (a != null) {
                        C66717h hVar = (C66717h) a;
                        if (hVar.mo90752b().size() >= 2) {
                            String str2 = hVar.mo90752b().get(1);
                            if (lVar == null) {
                                Iterator<T> it = cVar.f348903a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    C13604l lVar2 = (C13604l) t;
                                    if (C87412m.m108589b(lVar2.f38555d, str2) || C87412m.m108589b(lVar2.f38556e, str2)) {
                                        z = true;
                                        continue;
                                    } else {
                                        z = false;
                                        continue;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                                lVar = (C13604l) t;
                                if (lVar == null) {
                                    Log.m105928w("VFS.VFSRuleChecker", "Account not found, path: " + gVar.f348790e);
                                }
                            } else if (!C87412m.m108589b(lVar.f38555d, str2) && !C87412m.m108589b(lVar.f38556e, str2)) {
                                C116267b2.m163813a("Cross account migration found: " + str2 + " <-> (" + ((String) lVar.f38555d) + XVFSFile.SEPARATOR_CHAR + ((String) lVar.f38556e));
                                return Boolean.FALSE;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.vfs.b2$b */
    public static final class C116269b extends C87413o implements C32227p<C116270c, FileSystem.C85995c, Boolean> {

        /* renamed from: d */
        public static final C116269b f348902d = new C116269b();

        public C116269b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C116270c cVar = (C116270c) obj;
            FileSystem.C85995c cVar2 = (FileSystem.C85995c) obj2;
            C87412m.m108594g(cVar, "ctx");
            C87412m.m108594g(cVar2, "fs");
            Set<T> D0 = C110818d0.m150904D0(cVar.f348904b.values());
            for (FileSystem.C85995c next : C116299g2.m163846b(cVar2, (C116299g2.C86006b<FileSystem.C85995c>) null)) {
                if (next instanceof NativeFileSystem.C116228g) {
                    NativeFileSystem.C116228g gVar = (NativeFileSystem.C116228g) next;
                    if (D0.contains(gVar.f348790e)) {
                        C116267b2.m163813a("Delete all main path found: " + gVar.f348790e);
                        return Boolean.FALSE;
                    }
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: a */
    public static final void m163813a(String str) {
        if (!(WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_BLUE || BuildInfo.IS_FLAVOR_PURPLE)) {
            Log.m105920e("VFS.VFSRuleChecker", str);
            return;
        }
        throw new AssertionError(str);
    }
}
