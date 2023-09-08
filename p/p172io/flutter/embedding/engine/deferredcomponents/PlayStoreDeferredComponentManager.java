package p172io.flutter.embedding.engine.deferredcomponents;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import p172io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import p172io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import p722v8.C37696c;
import p722v8.C37697d;
import p722v8.C90750b;

/* renamed from: io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager */
public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
    public static final String MAPPING_KEY = (DeferredComponentManager.class.getName() + ".loadingUnitMapping");
    private static final String TAG = "PlayStoreDeferredComponentManager";
    /* access modifiers changed from: private */
    public DeferredComponentChannel channel;
    private Context context;
    private FlutterApplicationInfo flutterApplicationInfo;
    /* access modifiers changed from: private */
    public FlutterJNI flutterJNI;
    private FeatureInstallStateUpdatedListener listener;
    public SparseArray<String> loadingUnitIdToComponentNames;
    public SparseArray<String> loadingUnitIdToSharedLibraryNames;
    /* access modifiers changed from: private */
    public Map<String, Integer> nameToSessionId;
    /* access modifiers changed from: private */
    public SparseIntArray sessionIdToLoadingUnitId;
    /* access modifiers changed from: private */
    public SparseArray<String> sessionIdToName;
    /* access modifiers changed from: private */
    public SparseArray<String> sessionIdToState;
    private C90750b splitInstallManager;

    /* renamed from: io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener */
    public class FeatureInstallStateUpdatedListener implements C37697d {
        private FeatureInstallStateUpdatedListener() {
        }

        public void onStateUpdate(C37696c cVar) {
            cVar.getClass();
            throw new RuntimeException("stub!");
        }
    }

    public PlayStoreDeferredComponentManager(Context context2, FlutterJNI flutterJNI2) {
        this.context = context2;
        this.flutterJNI = flutterJNI2;
        this.flutterApplicationInfo = ApplicationInfoLoader.load(context2);
        throw new RuntimeException("stub!");
    }

    private ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void initLoadingUnitMappingToComponentNames() {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
            String str = MAPPING_KEY;
            String string = bundle.getString(str, (String) null);
            if (string == null) {
                Log.m165286e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            } else if (!string.equals("")) {
                for (String split : string.split(",")) {
                    String[] split2 = split.split(XVFSFile.PATH_SEPARATOR, -1);
                    int parseInt = Integer.parseInt(split2[0]);
                    this.loadingUnitIdToComponentNames.put(parseInt, split2[1]);
                    if (split2.length > 2) {
                        this.loadingUnitIdToSharedLibraryNames.put(parseInt, split2[2]);
                    }
                }
            }
        }
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        Log.m165286e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    public void destroy() {
        this.splitInstallManager.mo124879a(this.listener);
        this.channel = null;
        this.flutterJNI = null;
    }

    public String getDeferredComponentInstallState(int i, String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.m165286e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return "unknown";
        } else if (!this.nameToSessionId.containsKey(str)) {
            return this.splitInstallManager.getInstalledModules().contains(str) ? "installedPendingLoad" : "unknown";
        } else {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
    }

    public void installDeferredComponent(int i, String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.m165286e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else if (!str.equals("") || i <= 0) {
            throw new RuntimeException("stub!");
        } else {
            loadDartLibrary(i, str);
        }
    }

    public void loadAssets(int i, String str) {
        if (verifyJNI()) {
            try {
                Context context2 = this.context;
                Context createPackageContext = context2.createPackageContext(context2.getPackageName(), 0);
                this.context = createPackageContext;
                this.flutterJNI.updateJavaAssetManager(createPackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void loadDartLibrary(int i, String str) {
        if (verifyJNI() && i >= 0) {
            String str2 = this.loadingUnitIdToSharedLibraryNames.get(i);
            if (str2 == null) {
                str2 = this.flutterApplicationInfo.aotSharedLibraryName + "-" + i + ".part.so";
            }
            String str3 = Build.SUPPORTED_ABIS[0];
            String replace = str3.replace("-", "_");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.context.getFilesDir());
            for (String file : this.context.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new File(file));
            }
            while (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove();
                if (file2 == null || !file2.isDirectory() || file2.listFiles() == null) {
                    String name = file2.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(replace))) {
                        arrayList.add(file2.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file2.getAbsolutePath());
                    }
                } else {
                    for (File add : file2.listFiles()) {
                        linkedList.add(add);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add((String) it4.next());
            }
            this.flutterJNI.loadDartDeferredLibrary(i, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
        }
    }

    public void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    public void setJNI(FlutterJNI flutterJNI2) {
        this.flutterJNI = flutterJNI2;
    }

    public boolean uninstallDeferredComponent(int i, String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.m165286e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.splitInstallManager.deferredUninstall(arrayList);
        if (this.nameToSessionId.get(str) == null) {
            return true;
        }
        this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
        return true;
    }
}
