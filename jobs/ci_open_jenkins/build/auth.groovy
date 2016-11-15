package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder

final CronExpressionForOnceEveryDay = "H H(9-17) * * *"

new SbtLibraryJobBuilder('http-caching-client').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('json-encryption').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('secure').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('crypto').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('simple-reactivemongo').
        build(this as DslFactory)

new SbtLibraryJobBuilder('reactivemongo-json').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('reactivemongo-test').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-health').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-json-logger').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('Play-Reactivemongo').
        build(this as DslFactory)

new SbtLibraryJobBuilder('mongo-caching').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-breadcrumb').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-config').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-filters').
        build(this as DslFactory)

new SbtLibraryJobBuilder('domain').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('hmrctest').
        withoutJUnitReports().
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('http-exceptions').
        withoutJUnitReports().
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-graphite').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorised-frontend').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorisation').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorisation-httpverbs-hotfix', 'play-authorisation', 'hotfix/httpverbs').
        build(this as DslFactory)

new SbtLibraryJobBuilder('dynamic-stub').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)

new SbtLibraryJobBuilder('tax-year').
        withCronTrigger(CronExpressionForOnceEveryDay).
        build(this as DslFactory)


new BuildMonitorViewBuilder('AUTH-MONITOR')
        .withJobs(
            'crypto',
            'domain',
            'dynamic-stub',
            'hmrctest',
            'http-caching-client',
            'http-exceptions',
            'json-encryption',
            'mongo-caching',
            'play-authorisation',
            'play-authorised-frontend',
            'secure',
            'tax-year',
        )
        .build(this)
