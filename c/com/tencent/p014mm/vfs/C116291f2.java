package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.C116335w;
import com.tencent.p014mm.vfs.C75061i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import sx3.C26236u;

/* renamed from: com.tencent.mm.vfs.f2 */
public final class C116291f2 implements C75061i {

    /* renamed from: a */
    public static final C116291f2 f348998a = new C116291f2();

    /* renamed from: b */
    public static final AbstractFileSystem[] f348999b;

    /* renamed from: c */
    public static final FileSystem[] f349000c;

    /* renamed from: d */
    public static final String[] f349001d = {"${data}/MicroMsg/", "${data}/MicroMsg/${account}/", "${dataCache}/", "${dataCache}/${account}/", "${data}/MicroMsg/", "${data}/MicroMsg/${account}/", "${dataCache}/", "${dataCache}/${account}/", "${sdTo}/MicroMsg/", "${sdTo}/MicroMsg/${accountSd}/", "${sdToCache}/", "${sdToCache}/${accountSd}/", "${sdTo}/MicroMsg/", "${sdTo}/MicroMsg/${accountSd}/", "${sdToCache}/", "${sdToCache}/${accountSd}/"};

    /* renamed from: e */
    public static final String[][] f349002e = {new String[]{"${data}/MicroMsg/"}, new String[]{"${data}/MicroMsg/${account}/"}, new String[]{"${dataCache}/", "${data}/MicroMsg/"}, new String[]{"${dataCache}/${account}/", "${data}/MicroMsg/${account}/"}, new String[]{"${data}/MicroMsg/", "${sdTo}/MicroMsg/", "${sdFrom}/MicroMsg/"}, new String[]{"${data}/MicroMsg/${account}/", "${sdTo}/MicroMsg/${accountSd}/", "${sdFrom}/MicroMsg/${accountSd}/"}, new String[]{"${dataCache}/", "${data}/MicroMsg/", "${sdToCache}/", "${sdTo}/MicroMsg/${accountSd}/"}, new String[]{"${dataCache}/${account}/", "${data}/MicroMsg/${account}/", "${sdToCache}/${accountSd}/", "${sdTo}/MicroMsg/${accountSd}/"}, new String[]{"${sdTo}/MicroMsg/"}, new String[]{"${sdTo}/MicroMsg/${accountSd}/"}, new String[]{"${sdToCache}/", "${sdTo}/MicroMsg/"}, new String[]{"${sdToCache}/${accountSd}/", "${sdTo}/MicroMsg/${accountSd}/"}, new String[]{"${sdTo}/MicroMsg/", "${sdFrom}/MicroMsg/"}, new String[]{"${sdTo}/MicroMsg/${accountSd}/", "${sdFrom}/MicroMsg/${accountSd}/"}, new String[]{"${sdToCache}/", "${sdTo}/MicroMsg/"}, new String[]{"${sdToCache}/${accountSd}/", "${sdTo}/MicroMsg/${accountSd}/"}};

    /* renamed from: f */
    public static final C32226l<FileSystem, FileSystem>[] f349003f = {C116292a.f349004d, C116293b.f349005d, C116294c.f349006d, C116295d.f349007d};

    /* renamed from: com.tencent.mm.vfs.f2$a */
    public static final class C116292a extends C87413o implements C32226l<FileSystem, AbstractFileSystem> {

        /* renamed from: d */
        public static final C116292a f349004d = new C116292a();

        public C116292a() {
            super(1);
        }

        public Object invoke(Object obj) {
            FileSystem fileSystem = (FileSystem) obj;
            C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
            AccessLogFileSystem accessLogFileSystem = new AccessLogFileSystem(fileSystem, 0, "${logFlags}");
            accessLogFileSystem.mo177573a("${name}", C116304j0.f349019a);
            return accessLogFileSystem;
        }
    }

    /* renamed from: com.tencent.mm.vfs.f2$b */
    public static final class C116293b extends C87413o implements C32226l<FileSystem, AbstractFileSystem> {

        /* renamed from: d */
        public static final C116293b f349005d = new C116293b();

        public C116293b() {
            super(1);
        }

        public Object invoke(Object obj) {
            FileSystem fileSystem = (FileSystem) obj;
            C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
            C116291f2 f2Var = C116291f2.f348998a;
            ExpireFileSystem expireFileSystem = new ExpireFileSystem(new QuotaFileSystem(fileSystem, C75061i.C75062a.m90021b(f2Var, 256), C75061i.C75062a.m90021b(f2Var, 512), C75061i.C75062a.m90020a(f2Var, 7), true, "${target},${threshold},${expire}"), C75061i.C75062a.m90020a(f2Var, 7), "${expire}");
            expireFileSystem.mo177573a("${name}", C116265a0.f348896a);
            return expireFileSystem;
        }
    }

    /* renamed from: com.tencent.mm.vfs.f2$c */
    public static final class C116294c extends C87413o implements C32226l<FileSystem, AbstractFileSystem> {

        /* renamed from: d */
        public static final C116294c f349006d = new C116294c();

        public C116294c() {
            super(1);
        }

        public Object invoke(Object obj) {
            FileSystem fileSystem = (FileSystem) obj;
            C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
            ExpireFileSystem expireFileSystem = new ExpireFileSystem(fileSystem, C75061i.C75062a.m90020a(C116291f2.f348998a, 7), "${expire}");
            expireFileSystem.mo177573a("${name}", C116265a0.f348896a);
            return expireFileSystem;
        }
    }

    /* renamed from: com.tencent.mm.vfs.f2$d */
    public static final class C116295d extends C87413o implements C32226l<FileSystem, AbstractFileSystem> {

        /* renamed from: d */
        public static final C116295d f349007d = new C116295d();

        public C116295d() {
            super(1);
        }

        public Object invoke(Object obj) {
            FileSystem fileSystem = (FileSystem) obj;
            C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
            C116291f2 f2Var = C116291f2.f348998a;
            return new QuotaFileSystem(fileSystem, C75061i.C75062a.m90021b(f2Var, 256), C75061i.C75062a.m90021b(f2Var, 512), C75061i.C75062a.m90020a(f2Var, 90), true, "${target},${threshold},${expire}");
        }
    }

    static {
        AbstractFileSystem[] abstractFileSystemArr = new AbstractFileSystem[16];
        abstractFileSystemArr[0] = new NativeFileSystem("${data}/MicroMsg/${dir}");
        abstractFileSystemArr[1] = new NativeFileSystem("${data}/MicroMsg/${account}/${dir}");
        abstractFileSystemArr[2] = new NativeFileSystem("${dataCache}/${dir}");
        abstractFileSystemArr[3] = new NativeFileSystem("${dataCache}/${account}/${dir}");
        NativeFileSystem nativeFileSystem = new NativeFileSystem("${data}/MicroMsg/${dir}");
        NativeFileSystem nativeFileSystem2 = new NativeFileSystem("${sdTo}/MicroMsg/${dir}");
        StatisticsFileSystem statisticsFileSystem = new StatisticsFileSystem(new NativeFileSystem("${sdFrom}/MicroMsg/${dir}"), false);
        C116319p0 p0Var = C116319p0.f349079a;
        statisticsFileSystem.mo177573a("${dir}", p0Var);
        StatisticsFileSystem statisticsFileSystem2 = new StatisticsFileSystem(new MigrationFileSystem("${sdFrom}", "${sdFrom}", (FileSystem) nativeFileSystem2, statisticsFileSystem), false);
        C116305j1 j1Var = C116305j1.f349020a;
        statisticsFileSystem2.mo177573a("${dir}", j1Var);
        abstractFileSystemArr[4] = new MigrationFileSystem(false, false, (FileSystem) nativeFileSystem, statisticsFileSystem2);
        NativeFileSystem nativeFileSystem3 = new NativeFileSystem("${data}/MicroMsg/${account}/${dir}");
        NativeFileSystem nativeFileSystem4 = new NativeFileSystem("${sdTo}/MicroMsg/${accountSalt}/${dir}");
        AbstractFileSystem[] abstractFileSystemArr2 = abstractFileSystemArr;
        StatisticsFileSystem statisticsFileSystem3 = new StatisticsFileSystem(new NativeFileSystem("${sdFrom}/MicroMsg/${accountSd}/${dir}"), false, (Collection<String>) null, C26236u.m33719b(".ref"));
        statisticsFileSystem3.mo177573a("${dir}", p0Var);
        StatisticsFileSystem statisticsFileSystem4 = new StatisticsFileSystem(new MigrationFileSystem("${sdFrom}", "${sdFrom}", (FileSystem) nativeFileSystem4, new C116335w.C116336a(new NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/${dir}"), "${accountSd}", "accountSd"), new C116335w.C116336a(statisticsFileSystem3, "${accountSd}", "accountSd")), false);
        statisticsFileSystem4.mo177573a("${dir}", j1Var);
        abstractFileSystemArr2[5] = new MigrationFileSystem(false, false, (FileSystem) nativeFileSystem3, statisticsFileSystem4);
        String str = "${data}/MicroMsg/${dir}";
        abstractFileSystemArr2[6] = new MigrationFileSystem(true, true, (FileSystem) new NativeFileSystem("${dataCache}/${dir}"), new NativeFileSystem(str));
        String str2 = "${data}/MicroMsg/${account}/${dir}";
        abstractFileSystemArr2[7] = new MigrationFileSystem(true, true, (FileSystem) new NativeFileSystem("${dataCache}/${account}/${dir}"), new NativeFileSystem(str2));
        String str3 = "${sdTo}/MicroMsg/${dir}";
        abstractFileSystemArr2[8] = new NativeFileSystem(str3);
        abstractFileSystemArr2[9] = new NativeFileSystem("${sdTo}/MicroMsg/${accountSalt}/${dir}");
        abstractFileSystemArr2[10] = new NativeFileSystem("${sdToCache}/${dir}");
        abstractFileSystemArr2[11] = new NativeFileSystem("${sdToCache}/${accountSalt}/${dir}");
        NativeFileSystem nativeFileSystem5 = new NativeFileSystem(str3);
        String str4 = "${sdFrom}/MicroMsg/${dir}";
        StatisticsFileSystem statisticsFileSystem5 = new StatisticsFileSystem(new NativeFileSystem(str4), false, (Collection<String>) null, C26236u.m33719b(".ref"));
        statisticsFileSystem5.mo177573a("${dir}", p0Var);
        abstractFileSystemArr2[12] = new MigrationFileSystem("${sdFrom}", "${sdFrom}", (FileSystem) nativeFileSystem5, statisticsFileSystem5);
        String str5 = "${sdTo}/MicroMsg/${accountSd}/${dir}";
        String str6 = "${sdFrom}/MicroMsg/${accountSd}/${dir}";
        abstractFileSystemArr2[13] = new MigrationFileSystem("${sdFrom}", "${sdFrom}", "${sdFrom}${noStrip}", (String) null, new NativeFileSystem("${sdTo}/MicroMsg/${accountSalt}/${dir}"), new C116335w.C116336a(new NativeFileSystem(str5), "${accountSd}", "accountSd"), new C116335w.C116336a(new StatisticsFileSystem(new NativeFileSystem(str6), false, (Collection<String>) null, C26236u.m33719b(".ref")), "${accountSd}", "accountSd"));
        abstractFileSystemArr2[14] = new NativeFileSystem("${sdToCache}/${dir}");
        abstractFileSystemArr2[15] = new NativeFileSystem("${sdToCache}/${accountSalt}/${dir}");
        f348999b = abstractFileSystemArr2;
        String str7 = str4;
        f349000c = new FileSystem[]{null, null, new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str)), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str2)), null, null, new MaintenanceGroup(new DeleteAllFileSystem((FileSystem) new NativeFileSystem("${sdToCache}/${dir}")), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str3)), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str7))), new MaintenanceGroup(new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem("${sdToCache}/${accountSd}/${dir}")), "${accountSd}", "accountSd"), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str5)), "${accountSd}", "accountSd"), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str6)), "${accountSd}", "accountSd")), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str7)), new MaintenanceGroup(new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str6)), "${accountSd}", "accountSd")), new MaintenanceGroup(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str3)), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str7))), new MaintenanceGroup(new DeleteAllFileSystem((FileSystem) new NativeFileSystem("${sdToCache}/${account}/${dir}")), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str5)), "${accountSd}", "accountSd"), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str6)), "${accountSd}", "accountSd")), null, null, new MaintenanceGroup(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str3)), new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str7))), new MaintenanceGroup(new DeleteAllFileSystem((FileSystem) new NativeFileSystem("${sdToCache}/${account}/${dir}")), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str5)), "${accountSd}", "accountSd"), new C116335w.C116336a(new DeleteAllFileSystem((FileSystem) new NativeFileSystem(str6)), "${accountSd}", "accountSd"))};
    }
}
