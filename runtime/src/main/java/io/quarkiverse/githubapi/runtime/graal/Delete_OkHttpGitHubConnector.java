package io.quarkiverse.githubapi.runtime.graal;

import com.oracle.svm.core.annotate.Delete;
import com.oracle.svm.core.annotate.TargetClass;

/**
 * We drop this connector altogether as the OkHttp version we are using in Quarkus is not compatible with it so we can't build
 * the native
 * executable with it around.
 * <p>
 * One option to fix it is to force using a newer version in each GitHub App project but it's not very practical.
 * <p>
 * This can be revisited when we will remove the Okhttp constraint in the Quarkus BOM.
 */
@TargetClass(className = "org.kohsuke.github.extras.okhttp3.OkHttpGitHubConnector")
@Delete
public final class Delete_OkHttpGitHubConnector {

}
