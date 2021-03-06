package OpenSourceProjects_Storybook.patches.projects

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = '69382d9b-7791-418a-9ff6-1c83b86ed6b5' (id = 'OpenSourceProjects_Storybook')
accordingly and delete the patch script.
*/
changeProject("69382d9b-7791-418a-9ff6-1c83b86ed6b5") {
    features {
        add {
            feature {
                type = "buildtype-graphs"
                id = "PROJECT_EXT_132"
                param("series", """
                    [
                      {
                        "type": "valueType",
                        "title": "Build Duration (all stages)",
                        "key": "BuildDuration"
                      }
                    ]
                """.trimIndent())
                param("format", "duration")
                param("hideFilters", "")
                param("title", "Build Duration")
                param("defaultFilters", "")
                param("seriesTitle", "Serie")
            }
        }
    }
}
