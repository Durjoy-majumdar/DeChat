package com.tencent.p014mm.plugin.setting.p102ui.setting.permission;

import com.tencent.p014mm.C0966R;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingContactPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.SettingContactPermissionUI */
public final class SettingContactPermissionUI extends BaseSettingPermissionUI {
    /* renamed from: H7 */
    public int mo6369H7() {
        return C0966R.C0971layout.cm9;
    }

    /* renamed from: I7 */
    public int mo6370I7() {
        return C0966R.string.lvv;
    }

    /* renamed from: J7 */
    public int mo6371J7() {
        return C0966R.string.f361318lz1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r20 = this;
            r0 = r20
            super.onResume()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            boolean r2 = f40.C86709a0.m107522a()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003f
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "WCOEntranceSwitch"
            int r2 = r2.mo107404b(r5, r4)
            if (r2 <= 0) goto L_0x0032
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.mo119677K(r1, r5)
            r1 = 1
            goto L_0x0040
        L_0x0032:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r2.mo119677K(r1, r5)
        L_0x003f:
            r1 = 0
        L_0x0040:
            r5 = 33554432(0x2000000, double:1.6578092E-316)
            long r7 = eb0.C75592q0.m90781k()
            long r5 = r5 & r7
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            r2 = 2131317013(0x7f095115, float:1.8252524E38)
            if (r1 == 0) goto L_0x009e
            if (r3 != 0) goto L_0x009e
            android.view.View r1 = r0.findViewById(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingContactPermissionUI"
            java.lang.String r8 = "onResume"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingContactPermissionUI"
            java.lang.String r7 = "onResume"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00e6
        L_0x009e:
            android.view.View r1 = r0.findViewById(r2)
            r2 = 8
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r13 = r3.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingContactPermissionUI"
            java.lang.String r15 = "onResume"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r3.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/setting/ui/setting/permission/SettingContactPermissionUI"
            java.lang.String r14 = "onResume"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingContactPermissionUI.onResume():void");
    }
}
