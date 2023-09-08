package bh3;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117293c;

/* renamed from: bh3.b */
public final class C104138b implements C117293c {
    /* renamed from: a */
    public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        int i;
        int i2;
        int i3;
        C104140d dVar = C104140d.f308132a;
        Log.m105924i("CameraHooker", "[CameraHooker] method:" + str4 + ",methodDec:" + str5 + ",caller:" + obj);
        if (str4 != null) {
            int hashCode = str4.hashCode();
            int i4 = 0;
            if (hashCode != -452631290) {
                if (hashCode != 3417674) {
                    if (hashCode == 1090594823 && str4.equals("release")) {
                        if (obj instanceof Camera) {
                            Camera camera = (Camera) obj;
                            C104140d.m138970a(C104140d.f308132a, 1, 3, camera.getParameters().get("wechat-scene"));
                            camera.release();
                            i4 = camera.hashCode();
                        }
                        Log.m105924i("CameraHooker", "on camera release " + i4);
                        return null;
                    }
                } else if (str4.equals(WeChatBrands.Business.GROUP_OPEN)) {
                    if (C87412m.m108589b(str5, "()Landroid/hardware/Camera;")) {
                        PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
                        if (!permissionSwitchCheckUtil.mo176849f() && PermissionSwitchCheckUtil.m163124b(permissionSwitchCheckUtil, str4, (C32226l) null, 2, (Object) null)) {
                            return null;
                        }
                        Log.m105924i("CameraHooker", "on camera open");
                        Camera open = Camera.open();
                        C104140d.m138970a(C104140d.f308132a, 1, 1, open.getParameters().get("wechat-scene"));
                        return open;
                    } else if (C87412m.m108589b(str5, "(I)Landroid/hardware/Camera;")) {
                        PermissionSwitchCheckUtil permissionSwitchCheckUtil2 = PermissionSwitchCheckUtil.f347926a;
                        if ((permissionSwitchCheckUtil2.mo176849f() || !PermissionSwitchCheckUtil.m163124b(permissionSwitchCheckUtil2, str4, (C32226l) null, 2, (Object) null)) && objArr != null) {
                            if (!(!(objArr.length == 0))) {
                                objArr = null;
                            }
                            if (objArr != null) {
                                if (!(objArr[0] instanceof Integer)) {
                                    objArr = null;
                                }
                                if (objArr != null) {
                                    Object obj2 = objArr[0];
                                    C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((Integer) obj2).intValue();
                                    Log.m105924i("CameraHooker", "on camera open: " + intValue);
                                    Camera open2 = Camera.open(intValue);
                                    C104140d.m138970a(C104140d.f308132a, 1, 1, open2.getParameters().get("wechat-scene"));
                                    return open2;
                                }
                            }
                        }
                    }
                }
            } else if (str4.equals("startPreview")) {
                if (obj instanceof Camera) {
                    Camera camera2 = (Camera) obj;
                    camera2.startPreview();
                    Camera.Size previewSize = camera2.getParameters().getPreviewSize();
                    int i5 = previewSize.width;
                    int i6 = previewSize.height;
                    int previewFrameRate = camera2.getParameters().getPreviewFrameRate();
                    int hashCode2 = camera2.hashCode();
                    C104140d.m138970a(C104140d.f308132a, 1, 2, camera2.getParameters().get("wechat-scene"));
                    int i7 = previewFrameRate;
                    i2 = i6;
                    i3 = i5;
                    i4 = hashCode2;
                    i = i7;
                } else {
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                Log.m105924i("CameraHooker", "on camera startPreview " + i4 + ": " + i3 + '-' + i2 + ", fps " + i);
            }
        }
        return null;
    }
}
