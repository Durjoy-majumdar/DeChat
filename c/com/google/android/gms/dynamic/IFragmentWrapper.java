package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {
        private byte _hellAccFlag_;

        public static class Proxy extends zza implements IFragmentWrapper {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            public IObjectWrapper getActivity() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            public Bundle getArguments() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) zzc.zza(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            public int getId() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            public IFragmentWrapper getParentFragment() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                IFragmentWrapper asInterface = Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            public IObjectWrapper getResources() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            public boolean getRetainInstance() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public String getTag() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            public IFragmentWrapper getTargetFragment() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                IFragmentWrapper asInterface = Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            public int getTargetRequestCode() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            public boolean getUserVisibleHint() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public IObjectWrapper getView() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            public boolean isAdded() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isDetached() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isHidden() {
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isInLayout() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isRemoving() {
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isResumed() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean zza = zzc.zza(transactAndReadException);
                transactAndReadException.recycle();
                return zza;
            }

            public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            public void setHasOptionsMenu(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            public void setMenuVisibility(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            public void setRetainInstance(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            public void setUserVisibleHint(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, z);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            public void startActivity(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, (Parcelable) intent);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            public void startActivityForResult(Intent intent, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, (Parcelable) intent);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new Proxy(iBinder);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
            r11.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d5, code lost:
            r11.writeNoException();
            com.google.android.gms.internal.stable.zzc.zza(r11, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
            r11.writeNoException();
            r11.writeInt(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0100, code lost:
            r11.writeNoException();
            com.google.android.gms.internal.stable.zzc.zza(r11, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
            /*
                r8 = this;
                r12 = 0
                switch(r9) {
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00f1;
                    case 4: goto L_0x00e6;
                    case 5: goto L_0x00e1;
                    case 6: goto L_0x00dc;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x00c6;
                    case 9: goto L_0x00c1;
                    case 10: goto L_0x00bc;
                    case 11: goto L_0x00b7;
                    case 12: goto L_0x00b2;
                    case 13: goto L_0x00ad;
                    case 14: goto L_0x00a8;
                    case 15: goto L_0x00a3;
                    case 16: goto L_0x009e;
                    case 17: goto L_0x0099;
                    case 18: goto L_0x0094;
                    case 19: goto L_0x008f;
                    case 20: goto L_0x007f;
                    case 21: goto L_0x0077;
                    case 22: goto L_0x006f;
                    case 23: goto L_0x0067;
                    case 24: goto L_0x005f;
                    case 25: goto L_0x0022;
                    case 26: goto L_0x0012;
                    case 27: goto L_0x0005;
                    default: goto L_0x0004;
                }
            L_0x0004:
                return r12
            L_0x0005:
                android.os.IBinder r9 = r10.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r9)
                r8.unregisterForContextMenu(r9)
                goto L_0x008a
            L_0x0012:
                android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR
                android.os.Parcelable r9 = com.google.android.gms.internal.stable.zzc.zza((android.os.Parcel) r10, r9)
                android.content.Intent r9 = (android.content.Intent) r9
                int r10 = r10.readInt()
                r8.startActivityForResult(r9, r10)
                goto L_0x008a
            L_0x0022:
                android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR
                android.os.Parcelable r9 = com.google.android.gms.internal.stable.zzc.zza((android.os.Parcel) r10, r9)
                android.content.Intent r9 = (android.content.Intent) r9
                k20.a r10 = new k20.a
                r10.<init>()
                r10.mo10233c(r9)
                java.lang.Object[] r1 = r10.mo10232b()
                java.lang.String r2 = "com/google/android/gms/dynamic/IFragmentWrapper$Stub"
                java.lang.String r3 = "dispatchTransaction"
                java.lang.String r4 = "(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r7 = "(Landroid/content/Intent;)V"
                r0 = r8
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r9 = r10.mo10231a(r12)
                android.content.Intent r9 = (android.content.Intent) r9
                r8.startActivity(r9)
                java.lang.String r1 = "com/google/android/gms/dynamic/IFragmentWrapper$Stub"
                java.lang.String r2 = "dispatchTransaction"
                java.lang.String r3 = "(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z"
                java.lang.String r4 = "Undefined"
                java.lang.String r5 = "startActivity"
                java.lang.String r6 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x008a
            L_0x005f:
                boolean r9 = com.google.android.gms.internal.stable.zzc.zza(r10)
                r8.setUserVisibleHint(r9)
                goto L_0x008a
            L_0x0067:
                boolean r9 = com.google.android.gms.internal.stable.zzc.zza(r10)
                r8.setRetainInstance(r9)
                goto L_0x008a
            L_0x006f:
                boolean r9 = com.google.android.gms.internal.stable.zzc.zza(r10)
                r8.setMenuVisibility(r9)
                goto L_0x008a
            L_0x0077:
                boolean r9 = com.google.android.gms.internal.stable.zzc.zza(r10)
                r8.setHasOptionsMenu(r9)
                goto L_0x008a
            L_0x007f:
                android.os.IBinder r9 = r10.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r9)
                r8.registerForContextMenu(r9)
            L_0x008a:
                r11.writeNoException()
                goto L_0x0106
            L_0x008f:
                boolean r9 = r8.isVisible()
                goto L_0x00d5
            L_0x0094:
                boolean r9 = r8.isResumed()
                goto L_0x00d5
            L_0x0099:
                boolean r9 = r8.isRemoving()
                goto L_0x00d5
            L_0x009e:
                boolean r9 = r8.isInLayout()
                goto L_0x00d5
            L_0x00a3:
                boolean r9 = r8.isHidden()
                goto L_0x00d5
            L_0x00a8:
                boolean r9 = r8.isDetached()
                goto L_0x00d5
            L_0x00ad:
                boolean r9 = r8.isAdded()
                goto L_0x00d5
            L_0x00b2:
                com.google.android.gms.dynamic.IObjectWrapper r9 = r8.getView()
                goto L_0x0100
            L_0x00b7:
                boolean r9 = r8.getUserVisibleHint()
                goto L_0x00d5
            L_0x00bc:
                int r9 = r8.getTargetRequestCode()
                goto L_0x00ea
            L_0x00c1:
                com.google.android.gms.dynamic.IFragmentWrapper r9 = r8.getTargetFragment()
                goto L_0x0100
            L_0x00c6:
                java.lang.String r9 = r8.getTag()
                r11.writeNoException()
                r11.writeString(r9)
                goto L_0x0106
            L_0x00d1:
                boolean r9 = r8.getRetainInstance()
            L_0x00d5:
                r11.writeNoException()
                com.google.android.gms.internal.stable.zzc.zza((android.os.Parcel) r11, (boolean) r9)
                goto L_0x0106
            L_0x00dc:
                com.google.android.gms.dynamic.IObjectWrapper r9 = r8.getResources()
                goto L_0x0100
            L_0x00e1:
                com.google.android.gms.dynamic.IFragmentWrapper r9 = r8.getParentFragment()
                goto L_0x0100
            L_0x00e6:
                int r9 = r8.getId()
            L_0x00ea:
                r11.writeNoException()
                r11.writeInt(r9)
                goto L_0x0106
            L_0x00f1:
                android.os.Bundle r9 = r8.getArguments()
                r11.writeNoException()
                com.google.android.gms.internal.stable.zzc.zzb(r11, r9)
                goto L_0x0106
            L_0x00fc:
                com.google.android.gms.dynamic.IObjectWrapper r9 = r8.getActivity()
            L_0x0100:
                r11.writeNoException()
                com.google.android.gms.internal.stable.zzc.zza((android.os.Parcel) r11, (android.os.IInterface) r9)
            L_0x0106:
                r9 = 1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.IFragmentWrapper.Stub.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    IObjectWrapper getActivity();

    Bundle getArguments();

    int getId();

    IFragmentWrapper getParentFragment();

    IObjectWrapper getResources();

    boolean getRetainInstance();

    String getTag();

    IFragmentWrapper getTargetFragment();

    int getTargetRequestCode();

    boolean getUserVisibleHint();

    IObjectWrapper getView();

    boolean isAdded();

    boolean isDetached();

    boolean isHidden();

    boolean isInLayout();

    boolean isRemoving();

    boolean isResumed();

    boolean isVisible();

    void registerForContextMenu(IObjectWrapper iObjectWrapper);

    void setHasOptionsMenu(boolean z);

    void setMenuVisibility(boolean z);

    void setRetainInstance(boolean z);

    void setUserVisibleHint(boolean z);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterForContextMenu(IObjectWrapper iObjectWrapper);
}
